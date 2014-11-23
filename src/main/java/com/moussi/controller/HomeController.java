package com.moussi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping(value="/greeting")
	public String sayHello(Model model)
	{
		model.addAttribute("greeting", "Hello Moussi");
		return "hello";
	}
	
	@RequestMapping(value="/index")
	public String index(Model model)
	{
		model.addAttribute("greeting", "Hello Moussi");
		return "index";
	}
}
