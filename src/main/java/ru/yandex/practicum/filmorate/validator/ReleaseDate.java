package ru.yandex.practicum.filmorate.validator;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ReleaseDateConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ReleaseDate {
    String message() default "{ReleaseDate}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}