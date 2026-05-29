package com.policehasini.WebProject.controllers;

import java.util.*;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
//import org.springframework.http.HttpStatus;

import com.policehasini.WebProject.model.User;
import com.policehasini.WebProject.services.UserService;



@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;
    public UserController() {
        userService = new UserService();
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {

        return ResponseEntity.ok(userService.getAllUsers());
    }
    
    // @Autowired
    // private UserService userService;

    // // GET ALL USERS
    // @GetMapping
    // public ResponseEntity<List<User>> getAll() {

    //     return ResponseEntity.ok(userService.getAllUsers());
    // }

    // // GET USER BY ID
    // @GetMapping("/{id}")
    // public ResponseEntity<User> getById(@PathVariable int id) {

    //     return ResponseEntity.ok(userService.getSingleUser(id));
    // }

    // // CREATE USER
    // @PostMapping
    // public ResponseEntity<User> create(@RequestBody User u) {

    //     userService.addUser(u.getName(), u.getGender(), u.getImage());

    //     return ResponseEntity.status(HttpStatus.CREATED).body(u);
    // }

    // // UPDATE USER
    // @PutMapping("/{id}")
    // public ResponseEntity<User> update(@PathVariable int id, @RequestBody User u) {

    //     userService.updateUser(
    //         u.getName(),
    //         u.getGender(),
    //         u.getImage(),
    //         id
    //     );

    //     return ResponseEntity.ok(u);
    // }

    // // DELETE USER
    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> delete(@PathVariable int id) {

    //     userService.deleteUser(id);

    //     return ResponseEntity.noContent().build();
    // }
}