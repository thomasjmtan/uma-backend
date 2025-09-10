package com.tart.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/uma")
@CrossOrigin(origins = "http://localhost:5173")
public class UmaController {

    @GetMapping("/hello")
    public String helloUma() {
        return "Hello uma-backend";
    }
}
