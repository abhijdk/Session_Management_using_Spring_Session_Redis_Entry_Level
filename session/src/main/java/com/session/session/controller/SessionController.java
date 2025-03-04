package com.session.session.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/s1")
public class SessionController {
    @GetMapping
    public Optional<String> demo(){
        return Optional.ofNullable("Demo");
    }
}
