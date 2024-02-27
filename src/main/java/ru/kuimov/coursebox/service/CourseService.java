package ru.kuimov.coursebox.service;

import ru.kuimov.coursebox.dto.CourseRequestToCreate;
import ru.kuimov.coursebox.dto.CourseRequestToUpdate;
import ru.kuimov.coursebox.entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    void updateCourseById(Long id, CourseRequestToUpdate request);

    void addCourse(CourseRequestToCreate request);

    void deleteCourseById(Long id);
}
