package com.wecp.eventmanagementsystem.repository;


import com.wecp.eventmanagementsystem.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
@Repository
public interface ResourceRepository extends JpaRepository<Resource,Long> {
=======

public interface ResourceRepository {
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    // extend jpa repository and add custom method if needed
}
