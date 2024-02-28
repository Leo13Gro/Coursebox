package ru.kuimov.coursebox.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kuimov.coursebox.dto.CourseRequestToCreate;
import ru.kuimov.coursebox.dto.CourseRequestToUpdate;
import ru.kuimov.coursebox.entity.Course;
import ru.kuimov.coursebox.repository.CourseRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No courses with this ID"));
    }

    @Override
    public void updateCourseById(Long id, CourseRequestToUpdate request) {
        Course courseToUpdate = getCourseById(id);
        courseToUpdate.setAuthor(request.getAuthor());
        courseToUpdate.setTitle(request.getTitle());
        courseRepository.save(courseToUpdate);
    }

    @Override
    public void addCourse(CourseRequestToCreate request) {
        Course course = new Course(request.getAuthor(), request.getTitle());
        System.out.println(course);
        courseRepository.save(course);
    }

    @Override
    public void deleteCourseById(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public List<Course> getCoursesByTitleWithPrefix(String prefix) {
        return getAllCourses().stream()
                .filter(course -> course.getTitle().startsWith(prefix))
                .toList();
    }
}
