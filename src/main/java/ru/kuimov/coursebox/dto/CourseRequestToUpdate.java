package ru.kuimov.coursebox.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequestToUpdate {
    @NotBlank
    private String author;

    @NotBlank
    private String title;
}
