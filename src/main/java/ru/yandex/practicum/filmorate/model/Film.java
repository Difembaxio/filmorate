package ru.yandex.practicum.filmorate.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import ru.yandex.practicum.filmorate.validator.ReleaseDate;
import java.time.LocalDate;
import java.util.Set;


@Data
@Builder
public class Film {

    private int id;
    @NotBlank
    private String name;
    @NotBlank
    @Size(max = 200)
    private String description;
    @NotNull
    @ReleaseDate(message = "Некорректна указана дата релиза.")
    private LocalDate releaseDate;
    @Positive
    private int duration;
    private Set<Integer> likes;
    @NotNull
    private Mpa mpa;
    private Set<Genre> genres;

}