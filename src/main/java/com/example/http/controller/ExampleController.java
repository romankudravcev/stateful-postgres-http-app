package com.example.http.controller;

import com.example.http.models.ExampleResponse;
import com.example.http.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

@Controller
@RequestMapping(value = "/http")
public class ExampleController {
    private final ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping
    public ResponseEntity<List<ExampleResponse>> getAll() {
        return ResponseEntity.ok(exampleService.getAll());
    }

    @PostMapping
    public ResponseEntity<ExampleResponse> post(@RequestBody String requestedIP, HttpServletRequest httpServletRequest) {
        String reachedIp = httpServletRequest.getLocalAddr();
        return ResponseEntity.ok(exampleService.post(requestedIP, reachedIp));
    }
}
