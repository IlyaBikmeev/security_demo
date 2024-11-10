package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Это публичный эндпоинт, доступен всем";
    }

    @GetMapping("/secure")
    public String secureEndpoint() {
        return "Это защищенный эндпоинт, доступен только авторизованным пользователям";
    }
}
