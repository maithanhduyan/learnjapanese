package com.learnjapanese.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnjapanese.service.KanjiBasicServiceImpl;

@Controller
public class KanjiBasicController {

	@Autowired
	private KanjiBasicServiceImpl kanjiService;

	@GetMapping(value = { "/214-bo-kanji-co-ban", "/214-bo-kanji-co-ban.html" })
	public String kanji214(
			@RequestParam(name = "name", required = false, defaultValue = "214 Bộ Thủ Kanji Cơ Bản") String name,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("kanjiBasicList", kanjiService.findAll());
		return "214_bo_kanji_co_ban";
	}
}
