package com.demo.pingserver;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/ping")
public class PingController {

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hi");
    }
}
