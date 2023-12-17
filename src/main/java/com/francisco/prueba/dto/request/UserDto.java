package com.francisco.prueba.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    
    @NotNull(message = "El Campo Nombre no puede ser Null")
    @Size(max = 50, min = 1, message = "")
    private String name;

    @NotNull(message = "El Campo Mail no puede ser Null")
    @Size(max = 100, message = "")
    @Pattern(regexp = ".+@.+\\..+")
    private String mail;

    @NotNull(message = "El Campo Password no puede ser Null")
    @Size(max = 255, min = 6, message = "")
    private String password;

}
