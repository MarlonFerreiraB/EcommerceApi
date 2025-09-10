package io.github.marlon.ecommerce.ecommerceapi.mapper;

import io.github.marlon.ecommerce.ecommerceapi.dto.OrderCreationDTO;
import io.github.marlon.ecommerce.ecommerceapi.dto.OrderResponseDTO;
import io.github.marlon.ecommerce.ecommerceapi.models.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UserMapper.class, ProductMapper.class, OrderMapper.class})
public interface OrderMapper {

    Order toEntity(OrderCreationDTO orderCreationDTO);
    OrderResponseDTO toResponse(OrderResponseDTO orderResponseDTO);
}
