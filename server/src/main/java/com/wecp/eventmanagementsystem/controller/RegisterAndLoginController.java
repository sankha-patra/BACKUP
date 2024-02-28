package com.wecp.eventmanagementsystem.controller;


import com.wecp.eventmanagementsystem.dto.LoginRequest;
import com.wecp.eventmanagementsystem.dto.LoginResponse;
import com.wecp.eventmanagementsystem.entity.User;
<<<<<<< HEAD
// import com.wecp.eventmanagementsystem.jwt.JwtUtil;
import com.wecp.eventmanagementsystem.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.AuthenticationException;
// import org.springframework.security.core.userdetails.UserDetails;
=======
import com.wecp.eventmanagementsystem.jwt.JwtUtil;
import com.wecp.eventmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

<<<<<<< HEAD
@RestController
public class RegisterAndLoginController {

    @Autowired
    private UserService userService;    
=======

public class RegisterAndLoginController {

>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0

    @PostMapping("/api/user/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
       // register user and return the registered user with status code 201 created
<<<<<<< HEAD
       return new ResponseEntity<>(userService.registerUser(user),HttpStatus.CREATED);
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }

    @PostMapping("/api/user/login")
    public ResponseEntity<LoginResponse> loginUser(@RequestBody LoginRequest loginRequest) {
         // login user and return the login response with status code 200 ok
        // if authentication fails, return status code 401 unauthorized
<<<<<<< HEAD
        return null;
    }
    @GetMapping("/api/users")
    public ResponseEntity<List<User>> getAllUser(){
        return new ResponseEntity<>(userService.getAllUser(),HttpStatus.OK) ;
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }
}
