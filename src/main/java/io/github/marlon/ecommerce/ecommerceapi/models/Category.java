package io.github.marlon.ecommerce.ecommerceapi.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "categoria")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    @ManyToMany(mappedBy = "category")
    private Product product;
}
