package com.internal.ordermanagement.controller;

import com.internal.ordermanagement.entity.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping
    public String getAllOrders() {
        return "Orders endpoint working";
    }

    @PostMapping
    public String createOrder(@RequestBody Order order) {
        return "Order created";
    }

    @GetMapping("/{id}")
    public String getOrderById(@PathVariable Long id) {
        return "Order ID: " + id;
    }
}
