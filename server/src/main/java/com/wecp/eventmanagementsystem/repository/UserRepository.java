package com.wecp.eventmanagementsystem.repository;


import com.wecp.eventmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    // extend jpa repository and add custom method if needed
    public User findByUsername(String username);
=======

public interface UserRepository {
    // extend jpa repository and add custom method if needed
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
}

