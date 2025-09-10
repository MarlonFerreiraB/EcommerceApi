package io.github.marlon.ecommerce.ecommerceapi.dto;

import jakarta.validation.constraints.NotBlank;

public record OrderItemCreationDTO(
        @NotBlank(message = "Esse campe deve haver pelo menos 1 unidade")
        Integer quantity,
        @NotBlank(message = "Este campo é necessario para localizar o produto")
        String productId
) {
}
