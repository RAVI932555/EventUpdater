package com.eventUpdater.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventUpdater.sEntity.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
