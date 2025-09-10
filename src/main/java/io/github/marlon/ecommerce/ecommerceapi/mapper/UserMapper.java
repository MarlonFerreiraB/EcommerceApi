package io.github.marlon.ecommerce.ecommerceapi.mapper;

import io.github.marlon.ecommerce.ecommerceapi.dto.UserCreationDTO;
import io.github.marlon.ecommerce.ecommerceapi.dto.UserResponseDTO;
import io.github.marlon.ecommerce.ecommerceapi.dto.UserUpdateDTO;
import io.github.marlon.ecommerce.ecommerceapi.models.User;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserCreationDTO userCreationDTO);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void toEntityUpdate(UserUpdateDTO userUpdateDTO, @MappingTarget User user);

    UserResponseDTO toResponse(User user);
}
