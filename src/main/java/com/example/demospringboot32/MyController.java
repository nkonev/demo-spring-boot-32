package com.example.demospringboot32;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

@Validated
@RestController
public class MyController {

    @Autowired
    private RestClient restClient;

    @GetMapping("/hi")
    public String get() {
        return "hi";
    }

    @GetMapping("/hello/{id}")
    public String get2(@PathVariable @Valid @Min(2) int id) {
        var response = restClient
                .get()
                .uri("http://localhost:8080/hi")
                .retrieve()
                .toEntity(new ParameterizedTypeReference<String>() {})
                .getBody();
        return "hello, " + response + " " + id;
    }

}
