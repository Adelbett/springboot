package tn.esprit.adelbettaiebarctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.adelbettaiebarctic3.Repos.CourseRepository;
import tn.esprit.adelbettaiebarctic3.entites.Course;

import java.util.List;
@Service
public class CourseService implements ICourseService{
@Autowired
private CourseRepository courseRepository;
    @Override
    public Course addCourse(Course c) {
        return courseRepository.save(c);
    }

    @Override
    public Course update(Course c) {
        return courseRepository.save(c);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        return courseRepository.findById(numCourse).orElse(null);
    }

    @Override
    public void deleteCourse(Long numCourse) {
        courseRepository.deleteById(numCourse);

    }

    @Override
    public List<Course> retrieveAll() {
        return courseRepository.findAll();
    }
}
