package com.moussi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.moussi.model.Event;

@Controller
public class EventController {

	@RequestMapping(value="/event",method=RequestMethod.GET)
	public String displayEventPage(Model model)
	{
		Event event = new Event();
		event.setName("Channel9 Java Proj on VS13");
		model.addAttribute("event", event);
		return "event";
	}
	
	@RequestMapping(value="/greeting")
	public String sayHello(Model model)
	{
		model.addAttribute("greeting", "Hello Moussi");
		return "hello";
	}
}
