package io.github.marlon.ecommerce.ecommerceapi.mapper;

import io.github.marlon.ecommerce.ecommerceapi.dto.CategoryCreationDTO;
import io.github.marlon.ecommerce.ecommerceapi.dto.CategoryResponseDTO;
import io.github.marlon.ecommerce.ecommerceapi.dto.CategoryUpdateDTO;
import io.github.marlon.ecommerce.ecommerceapi.models.Category;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", uses = ProductMapper.class)
public interface CategoryMapper {

    Category toEntity(CategoryCreationDTO categoryCreationDTO);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void toEntityUpdate(CategoryUpdateDTO categoryUpdateDTO, @MappingTarget Category category);

    CategoryResponseDTO toResponse(Category category);
}
