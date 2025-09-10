package io.github.marlon.ecommerce.ecommerceapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UserCreationDTO(
        @NotBlank(message = "O primeiro nome é obrigatório")
        @Size(max = 50, message = "O maximo de caracteres é 50")
        String firstName,
        @NotBlank(message = "O sobrenome é obrigatório")
        @Size(max = 50, message = "O maximo de caracteres é de 50")
        String lastName,
        @NotBlank(message = "O email é obrigatório")
        @Email(regexp = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$",message = "O email deve conter pelo menos uma letra minuscula e uma maiscula, sinal de @ e dominio")
        String email,
        @NotBlank(message = "A senha é obrigatória")
        @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()\\[\\]{}:;',?/*~$^+=<>-]).{8,20}$")
        String password) {

}
