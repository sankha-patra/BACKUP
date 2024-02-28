package com.wecp.eventmanagementsystem.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Allocation {
<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long allocationID;

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event event;

    @OneToOne
    @JoinColumn(name = "resourceID")
=======

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long allocationID;


   
    private Event event;

    
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    private Resource resource;

    private int quantity;


    public Long getAllocationID() {
        return allocationID;
    }

    public void setAllocationID(Long allocationID) {
        this.allocationID = allocationID;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
