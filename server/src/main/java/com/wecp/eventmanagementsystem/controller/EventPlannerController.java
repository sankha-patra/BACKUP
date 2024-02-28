package com.wecp.eventmanagementsystem.controller;


import com.wecp.eventmanagementsystem.entity.Allocation;
import com.wecp.eventmanagementsystem.entity.Event;
import com.wecp.eventmanagementsystem.entity.Resource;
import com.wecp.eventmanagementsystem.entity.User;
import com.wecp.eventmanagementsystem.service.EventService;
import com.wecp.eventmanagementsystem.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventPlannerController {

    @Autowired
    private EventService eventService;

    @Autowired
    private ResourceService resourceService;


    @PostMapping("/api/planner/event")
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        // create event and return created event with status code 201 (CREATED)

        return new ResponseEntity<Event>(eventService.createEvent(event), HttpStatus.CREATED);
    }

    @GetMapping("/api/planner/events")
    public ResponseEntity<List<Event>> getAllEvents() {
        // get all events and return the list with status code 200 (OK)
        return new ResponseEntity<>(eventService.getAllEvents(),HttpStatus.OK);
    }

    @PostMapping("/api/planner/resource")
    public ResponseEntity<Resource> addResource(@RequestBody Resource resource) {
        // add resource and return added resource with status code 201 (CREATED)
        return new ResponseEntity<>(resourceService.addResource(resource),HttpStatus.CREATED);

    }

    @GetMapping("/api/planner/resources")
    public ResponseEntity<List<Resource>> getAllResources() {
        // get all resources and return the list with status code 200 (OK)
        return new ResponseEntity<>(resourceService.getAllResources(),HttpStatus.OK);
    }

    @PostMapping("/api/planner/allocate-resources")
    public ResponseEntity<String> allocateResources(@RequestParam Long eventId, @RequestParam Long resourceId,
            @RequestBody Allocation allocation) {

        // allocate resources for the event and return a success message with status code 201 (CREATED)
        resourceService.allocateResources(eventId, resourceId, allocation);
        return new ResponseEntity<>("{\"message\": \"Resource allocated successfully for Event ID: " + eventId + "\"}", HttpStatus.CREATED);
    }

   
}
