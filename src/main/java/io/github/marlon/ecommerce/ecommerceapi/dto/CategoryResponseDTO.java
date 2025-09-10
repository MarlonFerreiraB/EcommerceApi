package io.github.marlon.ecommerce.ecommerceapi.dto;

import io.github.marlon.ecommerce.ecommerceapi.models.Product;

import java.util.Set;

public record CategoryResponseDTO(
        String name,
        Set<Product> products
) {
}
