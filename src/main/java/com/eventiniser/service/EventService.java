package com.eventiniser.service;

import com.eventiniser.entity.Event;

import java.util.List;

public interface EventService {

    List<Event> findAll();

    Event findById(Long id);

    Event save(Event event);

    Event update(Event event);

    void deleteById(Long id);
}
