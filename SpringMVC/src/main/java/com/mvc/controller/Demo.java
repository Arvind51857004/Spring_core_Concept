package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/project")
public class Demo {
	
	
	@RequestMapping("/books")
	public String books(Model model) {
		String name="Arvind";
		model.addAttribute("value",name);
		return "Books";
	}
	
	
	@RequestMapping("/details")
	public String bookname(@RequestParam("arvind")String formvalue,Model mod) {
		mod.addAttribute("abook",formvalue);
		return "arvindbook";
	}
	
	
	
	
	
	
	

}
