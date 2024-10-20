package com.example.http.repositories;

import com.example.http.models.ExampleResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleResponseRepository extends JpaRepository<ExampleResponse, Long> {
}
