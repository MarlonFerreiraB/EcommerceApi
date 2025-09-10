package io.github.marlon.ecommerce.ecommerceapi.dto;

import io.github.marlon.ecommerce.ecommerceapi.models.Category;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Set;

public record ProductCreationDTO(
        @NotBlank(message = "Este campo não pode ficar em branco")
        @Size(max = 60, message = "o nome deve ter até 60 caracteres")
        String name,
        @Min(1)
        @NotBlank(message = "O campo preço não pode ficar vazio")
        Integer price,
        @NotBlank(message = "Selecione as categorias que o produto se encaixe")
        Set<Category> categories
) {
}
