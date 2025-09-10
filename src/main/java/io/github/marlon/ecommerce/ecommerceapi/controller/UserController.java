package io.github.marlon.ecommerce.ecommerceapi.controller;

import io.github.marlon.ecommerce.ecommerceapi.dto.UserCreationDTO;
import io.github.marlon.ecommerce.ecommerceapi.dto.UserResponseDTO;
import io.github.marlon.ecommerce.ecommerceapi.dto.UserUpdateDTO;
import io.github.marlon.ecommerce.ecommerceapi.models.User;
import io.github.marlon.ecommerce.ecommerceapi.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> postUser(@RequestBody @Valid UserCreationDTO userCreationDTO){
        UserResponseDTO userResponseDTO = userService.createUser(userCreationDTO);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(userResponseDTO.id())
                .toUri();
        return ResponseEntity.created(location).build();
    }


    @GetMapping("/id")
    public ResponseEntity<Object> findByUser(@PathVariable String id){
        User user = userService.findyByid(id).orElseThrow(() -> new RuntimeException("error"));
        UserResponseDTO responseDTO =userService.transformResponse(user);
        return ResponseEntity.ok(responseDTO);

    }

    @DeleteMapping("/id")
    public ResponseEntity<Object> deleteById(@PathVariable String id){
        return userService.findyByid(id).map(u -> {
            userService.deleteById(id);
            return ResponseEntity.noContent().build();
        }).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/id")
    public ResponseEntity<UserResponseDTO> putUser(@RequestBody UserUpdateDTO userUpdateDTO, @PathVariable String id){
        User user = userService.findyByid(id).orElseThrow(() -> new RuntimeException(""));
        UserResponseDTO responseDTO = userService.updateUser(userUpdateDTO,user);
        return ResponseEntity.ok().body(responseDTO);

    }


}
