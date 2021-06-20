package com.example.mockupwebapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {


    @GetMapping(value = {"", "/", "/index", "/main"})
    public String mainPage() {
        return "mainPage";
    }

    @GetMapping(value = {"/ping"})
    public ResponseEntity<Map<String, Object>> ping() {
        Map<String, Object> body = new HashMap<>();
        body.put("some text", "answer");
        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
