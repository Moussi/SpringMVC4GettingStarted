package com.moussi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moussi.model.Event;

@RestController
public class EventsReportController {

	@RequestMapping("/events")
	public List<Event> getEvents()
	{
		List<Event> events = new ArrayList<Event>();
		
		Event event1 =new Event();
		event1.setName("event1");
		Event event2 =new Event();
		event2.setName("event2");
		Event event3 =new Event();
		event3.setName("event3");
		
		events.add(event1);
		events.add(event2);
		events.add(event3);
		
		return events;
	}
}
