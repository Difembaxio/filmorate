package ru.yandex.practicum.filmorate.model;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;




@Data
@Builder
public class Mpa {

    @NotNull
    private Integer id;
    @NotNull
    private String name;

}