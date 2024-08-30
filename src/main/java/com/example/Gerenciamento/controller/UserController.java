package com.example.Gerenciamento.controller;


import com.example.Gerenciamento.domain.user.RequestUser;
import com.example.Gerenciamento.domain.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @PostMapping
    public ResponseEntity registerUser(@Validated @RequestBody  RequestUser data){
        return userService.registerUser(data);
    }

    @PostMapping("/login")
    public ResponseEntity enterUser(@Validated @RequestBody RequestUser data){
        return userService.enterUser(data);
    }

    @PutMapping
    public ResponseEntity updateUser(@Validated @RequestBody RequestUser data){
        return userService.updateUser(data);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUserById(@PathVariable String id){
        return userService.deleteUserById(id);
    }

}

