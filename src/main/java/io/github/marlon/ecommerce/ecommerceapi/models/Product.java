package io.github.marlon.ecommerce.ecommerceapi.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "produtos")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private Integer preco;
    @ManyToMany
    @JoinTable(
            name = "produto-categoria",
            joinColumns =  @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )

    private Category category;
}
