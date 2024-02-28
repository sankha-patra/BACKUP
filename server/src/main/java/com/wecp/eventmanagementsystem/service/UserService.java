package com.wecp.eventmanagementsystem.service;


import com.wecp.eventmanagementsystem.entity.User;
import com.wecp.eventmanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
// public class UserService implements UserDetailsService {
public class UserService{
    @Autowired
    private UserRepository userRepository;
=======
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public class UserService implements UserDetailsService {
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0


    public User registerUser(User user) {
        // encode a password before saving
        // then register the user
<<<<<<< HEAD
        return userRepository.save(user);
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }

    public User getUserByUsername(String username) {
      // get user by username
<<<<<<< HEAD
      return userRepository.findByUsername(username);
    }
    public List<User> getAllUser(){
      return userRepository.findAll();
    }
    // @Override
    // public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    //     // load UserDetails by username
    //     return null;
    // }
=======
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // load UserDetails by username
    }
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
}
