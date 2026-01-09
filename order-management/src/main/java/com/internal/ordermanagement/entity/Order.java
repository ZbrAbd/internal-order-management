package com.internal.ordermanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders") // "order" is a reserved keyword in SQL
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id") // explicitly defines foreign key column
    private AppUser user;

    @ManyToOne
    @JoinColumn(name = "product_id") // explicitly defines foreign key column
    private Product product;

    private String status;

    // Constructors
    public Order() {}

    public Order(AppUser user, Product product, String status) {
        this.user = user;
        this.product = product;
        this.status = status;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public AppUser getUser() { return user; }
    public void setUser(AppUser user) { this.user = user; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
