package com.moussi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.moussi.model.Event;

@Controller
@SessionAttributes("event")
public class EventController {

	@RequestMapping(value="/event",method=RequestMethod.GET)
	public String displayEventPage(Model model)
	{
		Event event = new Event();
		event.setName("Channel9 Java Proj on VS13");
		model.addAttribute("event", event);
		return "event";
	}
	
	@RequestMapping(value="/event",method=RequestMethod.POST)
	public String ProcessEventPage(@ModelAttribute("event")Event event)
	{
		System.out.println(event);
		return "redirect:greeting.html";
	}
	

}
