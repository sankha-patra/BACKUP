package com.wecp.eventmanagementsystem.controller;


import com.wecp.eventmanagementsystem.entity.Event;
import com.wecp.eventmanagementsystem.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
@RestController
public class StaffController {

    @Autowired
    private EventService eventService;
=======

public class StaffController {
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0


    @GetMapping("/api/staff/event-details/{eventId}")
    public ResponseEntity<Event> getEventDetails(@PathVariable Long eventId) {
        // get the event details by eventId and return the event with status code 200 ok
<<<<<<< HEAD
        return new ResponseEntity<Event>(eventService.getEventDetails(eventId), HttpStatus.OK);
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }

    @PutMapping("/api/staff/update-setup/{eventId}")
    public ResponseEntity<Event> updateEventSetup(@PathVariable Long eventId, @RequestBody Event updatedEvent) {
        // update the event setup and return the updated event with status code 200 ok
<<<<<<< HEAD
        return new ResponseEntity<>(eventService.updateEventSetup(eventId, updatedEvent),HttpStatus.OK);
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }
}
