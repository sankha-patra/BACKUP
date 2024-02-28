package com.wecp.eventmanagementsystem.entity;


import javax.persistence.*;

@Entity
public class Resource {
<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    private Long resourceID;

    private String name;
    private String type;
    private boolean availability;

    public Long getResourceID() {
        return resourceID;
    }

    public void setResourceID(Long resourceID) {
        this.resourceID = resourceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}