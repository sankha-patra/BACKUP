package com.wecp.eventmanagementsystem.entity;


import javax.persistence.*;
<<<<<<< HEAD

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
import java.util.Date;
import java.util.List;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    private Long eventID;

    private String title;
    private String description;
    private Date dateTime;
    private String location;
    private String status;

<<<<<<< HEAD
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Allocation> allocations;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

=======
    
    private List<Allocation> allocations;

>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Allocation> getAllocations() {
        return allocations;
    }

    public void setAllocations(List<Allocation> allocations) {
        this.allocations = allocations;
    }
<<<<<<< HEAD

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
}
