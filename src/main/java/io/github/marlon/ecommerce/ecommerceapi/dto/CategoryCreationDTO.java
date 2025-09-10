package io.github.marlon.ecommerce.ecommerceapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoryCreationDTO(
        @NotBlank(message = "Este campo não pode ficar em branco")
        @Size(max = 20, message = "O nome da categoria não pode exceder 20 carecteres")
        String name
) {
}
