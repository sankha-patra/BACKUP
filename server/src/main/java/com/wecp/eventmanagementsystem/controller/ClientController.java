package com.wecp.eventmanagementsystem.controller;

import com.wecp.eventmanagementsystem.entity.Event;
import com.wecp.eventmanagementsystem.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


<<<<<<< HEAD
@RestController
public class ClientController {

    @Autowired
    private EventService eventService;

=======
public class ClientController {

>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0

    @GetMapping("/api/client/booking-details/{eventId}")
    public ResponseEntity<Event> getBookingDetails(@PathVariable Long eventId) {
        // get event details by event id and return with status code 200 OK
<<<<<<< HEAD
        return new ResponseEntity<Event>(eventService.getEventDetails(eventId), HttpStatus.OK);
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }
}
