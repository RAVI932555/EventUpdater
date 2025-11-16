package com.eventUpdater.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventUpdater.sEntity.Event;
import com.eventUpdater.service.IEventService;

@RestController
@RequestMapping("/event")
public class EventController {

	@Autowired
	private IEventService eventService;
	
	@PostMapping("/add")
	public Event addEvent(@RequestBody Event event) {
		return eventService.addEvent(event);
	}
	
	@GetMapping("/all")
	public List<Event> getAllEvent(){
		return eventService.getAllEvent();
	}
}
