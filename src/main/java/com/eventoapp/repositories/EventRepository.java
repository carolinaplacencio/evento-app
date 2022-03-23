package com.eventoapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.models.Event;

public interface EventRepository extends CrudRepository<Event, String> {

}
