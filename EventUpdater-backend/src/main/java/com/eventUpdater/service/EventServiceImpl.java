package com.eventUpdater.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventUpdater.repository.EventRepository;
import com.eventUpdater.sEntity.Event;
@Service("event")
public class EventServiceImpl implements IEventService {

	@Autowired
	private EventRepository eventRepository;
	@Override
	public Event addEvent(Event event) {
		return eventRepository.save(event) ;
	}
	@Override
	public List<Event> getAllEvent() {
		return eventRepository.findAll();
	}

}
