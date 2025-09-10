package io.github.marlon.ecommerce.ecommerceapi.mapper;

import io.github.marlon.ecommerce.ecommerceapi.dto.ProductCreationDTO;
import io.github.marlon.ecommerce.ecommerceapi.dto.ProductRespondeDTO;
import io.github.marlon.ecommerce.ecommerceapi.dto.ProductUpdateDTO;
import io.github.marlon.ecommerce.ecommerceapi.models.Product;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", uses = CategoryMapper.class)
public interface ProductMapper {

    Product toEntity(ProductCreationDTO productCreationDTO);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void toEntityUpdate(ProductUpdateDTO productUpdateDTO, @MappingTarget  Product product);

    ProductRespondeDTO toResponse(Product product);
}
