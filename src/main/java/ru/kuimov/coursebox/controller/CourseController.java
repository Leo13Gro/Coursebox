package ru.kuimov.coursebox.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kuimov.coursebox.dto.CourseRequestToCreate;
import ru.kuimov.coursebox.dto.CourseRequestToUpdate;
import ru.kuimov.coursebox.entity.Course;
import ru.kuimov.coursebox.service.CourseService;

import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable("id") Long id) {
        return courseService.getCourseById(id);
    }

    @PostMapping("")
    public void addCourse(@RequestBody CourseRequestToCreate request){
        courseService.addCourse(request);
    }

    @PutMapping("/{id}")
    public void updateCourseById(@PathVariable("id") Long id, @RequestBody CourseRequestToUpdate request){
        courseService.updateCourseById(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseById(@PathVariable("id") Long id){
        courseService.deleteCourseById(id);
    }
}
