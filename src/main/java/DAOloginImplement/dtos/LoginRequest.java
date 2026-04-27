package DAOloginImplement.dtos;

import jakarta.validation.constraints.NotBlank;

public record LoginRequest(

        @NotBlank
        String nome,
        @NotBlank
        String email,
        @NotBlank
        String password

) {
}
