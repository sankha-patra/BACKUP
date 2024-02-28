package com.wecp.eventmanagementsystem.repository;


import com.wecp.eventmanagementsystem.entity.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


<<<<<<< HEAD
@Repository
public interface AllocationRepository  extends JpaRepository<Allocation,Long> {
=======
public interface AllocationRepository  {
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    // extend jpa repository and add custom methods if needed
}
