package io.github.marlon.ecommerce.ecommerceapi.dto;

import io.github.marlon.ecommerce.ecommerceapi.models.Category;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

import java.util.Set;

public record ProductUpdateDTO(
        @Size(max = 60, message = "o nome deve ter até 60 caracteres")
        String name,
        @Min(1)
        Integer price,
        Set<Category> categories
) {
}
