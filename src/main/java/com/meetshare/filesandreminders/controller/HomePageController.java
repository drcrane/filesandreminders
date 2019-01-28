package com.meetshare.filesandreminders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class HomePageController {
	@RequestMapping("/")
	public String index(Model model, @RequestParam(name="name", required=false, defaultValue="World") String name) {
		model.addAttribute("name", name);
		return "homepage";
	}
}
