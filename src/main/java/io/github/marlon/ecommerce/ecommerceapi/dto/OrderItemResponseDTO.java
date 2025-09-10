package io.github.marlon.ecommerce.ecommerceapi.dto;

import java.util.UUID;

public record OrderItemResponseDTO(
        UUID id,
        Integer quantity,
        Integer productPrice,
        ProductRespondeDTO productRespondeDTO

) {
}
