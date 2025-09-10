package io.github.marlon.ecommerce.ecommerceapi.dto;

import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record OrderCreationDTO(
        @NotNull(message = "é necessario pelo menos 1 item")
        Set<OrderItemCreationDTO> orderItemCreationDTOSet
) {
}
