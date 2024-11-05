package com.course.Thymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/home")
	public String loadHome(Model model) {

		model.addAttribute("name", "mohit");
		return "home";
	}

	@GetMapping("/elvis")
	public String elvisExample(Model model) {

		model.addAttribute("isAdmin", true);
		model.addAttribute("gender", "f");
		return "elvis";
	}

	@GetMapping("/each")
	public String eachExample(Model model) {

		List<String> stringList = List.of("First", "second", "Third");
		model.addAttribute("list", stringList);
		return "each";
	}
}
