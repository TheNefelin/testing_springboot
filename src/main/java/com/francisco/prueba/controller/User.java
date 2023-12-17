package com.francisco.prueba.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francisco.prueba.dto.request.UserDto;
import com.francisco.prueba.dto.request.UserDtoUpdate;
import com.francisco.prueba.dto.response.UserDtoRes;
import com.francisco.prueba.service.UserService;

@RestController
@RequestMapping(path = "user")
public class User {

    private UserService userService;

    public User (UserService userService) {
        this.userService = userService;
    }
    
    // el ResponseEntity<Boolean> se retorna en ResponseEntity<>(true
    @PostMapping(path = "/post")
    public ResponseEntity<Boolean> create(@RequestBody UserDto userDto) {
        this.userService.create(userDto);

        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @GetMapping(path = "/get")
    public List<UserDtoRes> get() {
        return this.userService.getAll();
    }

    @GetMapping(path = "/get/{id}")
    public UserDtoRes getById(@PathVariable String id) {
        return this.userService.getById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id) {
        boolean estado = this.userService.delete(id);
        return new ResponseEntity<>(estado, HttpStatus.OK);
    }

    @PutMapping(path = "/update")
    public ResponseEntity<Boolean> update(@RequestBody UserDtoUpdate updateUser) {
        boolean estado = this.userService.update(updateUser);
        return new ResponseEntity<>(estado, HttpStatus.OK);
    }
}
