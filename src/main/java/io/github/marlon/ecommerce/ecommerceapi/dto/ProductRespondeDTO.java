package io.github.marlon.ecommerce.ecommerceapi.dto;

import java.util.UUID;

public record ProductRespondeDTO(
        UUID id,
        String name,
        Integer price
) {
}
