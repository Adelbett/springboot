package tn.esprit.adelbettaiebarctic3.services;

import tn.esprit.adelbettaiebarctic3.entites.Course;

import java.util.List;

public interface ICourseService {
    Course addCourse(Course c);
        Course update(Course c);
        Course retrieveCourse(Long numCourse);
        void deleteCourse(Long numCourse);
        List<Course> retrieveAll();
}
