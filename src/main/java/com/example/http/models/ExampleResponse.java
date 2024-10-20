package com.example.http.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "example_responses") // Specify the table name
public class ExampleResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment strategy
    private Long id;

    private String requestedIP;
    private Instant requestTime;
    private String reachedIP;

    // Default constructor
    public ExampleResponse() {
    }

    // Parameterized constructor
    public ExampleResponse(String requestedIP, Instant requestTime, String reachedIP) {
        this.requestedIP = requestedIP;
        this.requestTime = requestTime;
        this.reachedIP = reachedIP;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestedIP() {
        return requestedIP;
    }

    public void setRequestedIP(String requestedIP) {
        this.requestedIP = requestedIP;
    }

    public Instant getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Instant requestTime) {
        this.requestTime = requestTime;
    }

    public String getReachedIP() {
        return reachedIP;
    }

    public void setReachedIP(String reachedIP) {
        this.reachedIP = reachedIP;
    }
}
