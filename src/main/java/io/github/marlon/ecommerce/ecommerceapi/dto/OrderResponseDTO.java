package io.github.marlon.ecommerce.ecommerceapi.dto;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public record OrderResponseDTO(
        UUID id,
        LocalDateTime createAt,
        Integer totalValue,
        UserResponseDTO userResponseDTO,
        Set<OrderItemResponseDTO> orderItemSet

) {
}
