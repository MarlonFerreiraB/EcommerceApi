package io.github.marlon.ecommerce.ecommerceapi.service;

import io.github.marlon.ecommerce.ecommerceapi.dto.UserCreationDTO;
import io.github.marlon.ecommerce.ecommerceapi.dto.UserResponseDTO;
import io.github.marlon.ecommerce.ecommerceapi.dto.UserUpdateDTO;
import io.github.marlon.ecommerce.ecommerceapi.mapper.UserMapper;
import io.github.marlon.ecommerce.ecommerceapi.models.User;
import io.github.marlon.ecommerce.ecommerceapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;


    @Transactional()
    public UserResponseDTO createUser(UserCreationDTO userCreationDTO){
        User newUser = userMapper.toEntity(userCreationDTO);
        userRepository.save(newUser);
        return userMapper.toResponse(newUser);
    }


    @Transactional(readOnly = true)
    public Optional<User> findyByid(String id){
        return userRepository.findById(id);
    }



    public UserResponseDTO transformResponse(User user){
        return userMapper.toResponse(user);
    }
    @Transactional
    public void deleteById(String id) {
        userRepository.deleteById(id);
    }

    @Transactional
    public UserResponseDTO updateUser(UserUpdateDTO userUpdateDTO, User user) {

        userMapper.toEntityUpdate(userUpdateDTO, user);
        userRepository.save(user);
        return userMapper.toResponse(user);

    }
}
