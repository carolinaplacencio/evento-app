package com.eventoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eventoapp.models.Event;
import com.eventoapp.repositories.EventRepository;

@Controller
public class EventController {
	@Autowired
	private EventRepository eventRepository;
	
	@RequestMapping(value="/event", method=RequestMethod.GET)
	public String form() {
		return "event/formEvent";
	}

	@RequestMapping(value="/event", method=RequestMethod.POST)
	public String form(Event event) {
		eventRepository.save(event);
		return "redirect:/event";
	}
}
