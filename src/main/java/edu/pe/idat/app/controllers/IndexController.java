package edu.pe.idat.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexController {
	
	@GetMapping({"", "/", "/index", "/home", "/star"})
	public String index(Model model) {
		model.addAttribute("titulo", "Starbucks");
		return "index";
	}

}
