package com.wecp.eventmanagementsystem.service;


import com.wecp.eventmanagementsystem.entity.Event;
import com.wecp.eventmanagementsystem.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

<<<<<<< HEAD
@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;
=======

public class EventService {

>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0


    public Event createEvent(Event event) {
       // save event in databse
<<<<<<< HEAD
       return eventRepository.save(event);
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }

    public List<Event> getAllEvents() {
        // get all events
<<<<<<< HEAD
        return eventRepository.findAll();
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }

    public Event getEventDetails(Long eventId) {
        // get event by eventId
<<<<<<< HEAD
        return eventRepository.findById(eventId).get();
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }

    public Event updateEventSetup(Long eventId, Event updatedEvent) {
       // update event
<<<<<<< HEAD
       return eventRepository.save(updatedEvent);
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }
}
