package ru.kuimov.coursebox.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.kuimov.coursebox.exception.response_message.DefaultResponseMessage;

import java.time.OffsetDateTime;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class CourseExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<DefaultResponseMessage> noSuchElementExceptionHandler(NoSuchElementException ex) {
        return new ResponseEntity<>(
                new DefaultResponseMessage(OffsetDateTime.now(), ex.getMessage()),
                HttpStatus.NOT_FOUND);
    }
}
