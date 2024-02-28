package ru.kuimov.coursebox.exception.response_message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@AllArgsConstructor
public class DefaultResponseMessage {
    private OffsetDateTime dateOccurred;

    private String message;
}
