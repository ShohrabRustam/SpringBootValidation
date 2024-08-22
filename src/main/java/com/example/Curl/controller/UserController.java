package com.example.Curl.controller;

import com.example.Curl.dto.UserRequest;
import com.example.Curl.entity.User;
import com.example.Curl.exception.UserNotFoundException;
import com.example.Curl.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);

    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>> fetchUser(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/fetch/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) throws UserNotFoundException {
        return ResponseEntity.ok(userService.getUser(id));
    }
}
