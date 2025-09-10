package io.github.marlon.ecommerce.ecommerceapi.mapper;

import io.github.marlon.ecommerce.ecommerceapi.dto.OrderItemCreationDTO;
import io.github.marlon.ecommerce.ecommerceapi.dto.OrderItemResponseDTO;
import io.github.marlon.ecommerce.ecommerceapi.models.OrderItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UserMapper.class, ProductMapper.class, OrderMapper.class} )
public interface OrderitemMapper {


    OrderItem toEntity(OrderItemCreationDTO orderItemCreationDTO);
    OrderItemResponseDTO toResponse(OrderItem orderItem);
}
