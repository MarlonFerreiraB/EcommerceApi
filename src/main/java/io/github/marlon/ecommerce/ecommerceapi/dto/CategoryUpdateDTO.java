package io.github.marlon.ecommerce.ecommerceapi.dto;

import io.github.marlon.ecommerce.ecommerceapi.models.Product;
import jakarta.validation.constraints.Size;

import java.util.Set;

public record CategoryUpdateDTO(
        @Size(max = 20, message = "O nome da categoria não pode exceder 20 carecteres")
        String name,
        Set<Product> products
) {
}
