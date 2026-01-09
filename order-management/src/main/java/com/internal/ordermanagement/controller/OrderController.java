package com.internal.ordermanagement.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping("/health")
    public String health() {
        return "Order Management API is running";
    }
}
