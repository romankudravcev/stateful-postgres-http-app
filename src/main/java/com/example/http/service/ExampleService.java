package com.example.http.service;

import com.example.http.models.ExampleResponse;
import com.example.http.repositories.ExampleResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ExampleService {

    private final ExampleResponseRepository exampleResponseRepository;

    @Autowired
    public ExampleService(ExampleResponseRepository exampleResponseRepository) {
        this.exampleResponseRepository = exampleResponseRepository;
    }

    public List<ExampleResponse> getAll() {
        return exampleResponseRepository.findAll();
    }

    public ExampleResponse post(String requestedIP, String reachedIp) {
        ExampleResponse response = new ExampleResponse(requestedIP, Instant.now(), reachedIp);
        exampleResponseRepository.save(response);
        return response;
    }
}
