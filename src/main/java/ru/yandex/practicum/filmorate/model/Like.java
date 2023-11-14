package ru.yandex.practicum.filmorate.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class Like {

    @NotNull
    private Integer id;
    @NotNull
    @Positive
    private Integer userId;
    @NotNull
    @Positive
    private Integer filmId;

}