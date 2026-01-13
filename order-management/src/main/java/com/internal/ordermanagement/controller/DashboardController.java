package com.internal.ordermanagement.controller;

import com.internal.ordermanagement.repository.OrderRepository;
import com.internal.ordermanagement.repository.ProductRepository;
import com.internal.ordermanagement.repository.UserRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    public DashboardController(OrderRepository orderRepository,
                               ProductRepository productRepository,
                               UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/stats")
    public Map<String, Object> getStats() {
        Map<String, Object> stats = new HashMap<>();
        stats.put("orders", orderRepository.findAll());
        stats.put("products", productRepository.findAll());
        stats.put("customers", userRepository.findAll());
        return stats;
    }
}
