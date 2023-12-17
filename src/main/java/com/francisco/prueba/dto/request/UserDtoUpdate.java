package com.francisco.prueba.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDtoUpdate {

    @NotNull
    @Positive
    private Integer id;

    private String name;

    private String mail;
}
