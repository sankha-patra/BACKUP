package com.wecp.eventmanagementsystem.service;

import com.wecp.eventmanagementsystem.entity.Allocation;
import com.wecp.eventmanagementsystem.entity.Event;
import com.wecp.eventmanagementsystem.entity.Resource;
<<<<<<< HEAD
import com.wecp.eventmanagementsystem.repository.AllocationRepository;
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
import com.wecp.eventmanagementsystem.repository.EventRepository;
import com.wecp.eventmanagementsystem.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

<<<<<<< HEAD
@Service
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    @Autowired
    private AllocationRepository allocationRepository;

    public Resource addResource(Resource resource) {
      // add resouce to database
      return resourceRepository.save(resource);
=======

public class ResourceService {


    public Resource addResource(Resource resource) {
      // add resouce to database
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }

    public List<Resource> getAllResources() {
        // get all resources
<<<<<<< HEAD
        return resourceRepository.findAll();
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }

    public void allocateResources(Long eventId, Long resourceId, Allocation allocation) {
        // check if resource is available or not
        // if resouce is available then allocate the resource to event  and set availability to false
<<<<<<< HEAD
        Resource resource = resourceRepository.findById(resourceId).get();
        if(resource != null){
            resource.setAvailability(false);
            resourceRepository.save(resource);//updating the existing resourse that it is not available
            allocationRepository.save(allocation);//now save the data
        }
=======

>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }
}
