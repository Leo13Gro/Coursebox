package ru.kuimov.coursebox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuimov.coursebox.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
