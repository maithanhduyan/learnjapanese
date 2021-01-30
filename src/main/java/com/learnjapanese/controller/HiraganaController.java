package com.learnjapanese.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learnjapanese.service.HiraganaServiceImpl;

@Controller
public class HiraganaController {

	@Autowired
	HiraganaServiceImpl hiraganaService;

	@GetMapping("/hiragana")
	public String hiraganaPage(Model model) {
		model.addAttribute("hiraganaList", hiraganaService.findAll());
		return "hiragana";
	}
}
