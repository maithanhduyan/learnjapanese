package com.learnjapanese.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
	    Model model) {
	model.addAttribute("name", name);
	return "home";
    }
    
    @GetMapping("/214-bo-Kanji-co-ban")
    public String kanji214(@RequestParam(name = "name", required = false, defaultValue = "214 Bộ Kanji Căn Bản") String name,
	    Model model) {
	model.addAttribute("name", name);
	return "214_bo_Kanji_co_ban";
    }
}
