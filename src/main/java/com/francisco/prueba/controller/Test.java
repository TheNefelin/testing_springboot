package com.francisco.prueba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "test")
public class Test {
    
    @GetMapping
    public String gettests() {
        return "HOLA";
    }

    @GetMapping("/get-a")
    // http://localhost:8080/test/get-a?id=1
    public String gettests_ByIdA(@RequestParam(name = "id") String id) {
        return "id-A: " + id;
    }

    @GetMapping("/get-b/{id}")
    // http://localhost:8080/test/get-b/1
    public String gettests_ByIdB(@PathVariable String id) {
        return "id-B: " + id;
    }

    @GetMapping("/get-c")
    // http://localhost:8080/test/get-c
    //{id: 0}
    public String gettests_ByIdC(@RequestBody BodyC bodyC) {
        return "id-C: " + bodyC.getId();
    }
    
}

class BodyC {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
} 