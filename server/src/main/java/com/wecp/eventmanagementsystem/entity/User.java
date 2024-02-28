package com.wecp.eventmanagementsystem.entity;


import javax.persistence.*;

<<<<<<< HEAD

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    private Long userID;

    private String username;
    private String password;
    private String email;
    private String role;

<<<<<<< HEAD
    
    public User() {
    }

=======
    public User() {
        
    }
    
    public User(Long userID, String username, String password, String email, String role) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }


>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
<<<<<<< HEAD
        System.out.println("Inside SetUserName");
=======
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}