package com.example.demo.controller;

import com.example.demo.model.ResultModel;
import com.example.demo.model.UserModel;
import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private UserModel model;
    @Autowired
    private ResultModel error;
    @Autowired
    private Service service;

    @GetMapping("/users")
    public ResponseEntity allUser(){
        return new ResponseEntity(service.allUser(), HttpStatus.OK);
    }

    @PostMapping("/save-user")
    public ResponseEntity save(@RequestBody UserModel model){
        return new ResponseEntity(service.saveUser(model), HttpStatus.OK);
    }

    @PutMapping("/update-user")
    public ResponseEntity update(@RequestBody UserModel model){
        return new ResponseEntity(service.updateUser(model), HttpStatus.OK);
    }

    @DeleteMapping("/delete-user/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id){
        return new ResponseEntity(service.deleteUser(id), HttpStatus.OK);
    }

}
