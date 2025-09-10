package com.tart.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/uma")
public class UmaController {

    @GetMapping("/hello")
    public String helloUma() {
        return "Hello uma-backend";
    }
}
