package tn.esprit.adelbettaiebarctic3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.adelbettaiebarctic3.entites.Course;
import tn.esprit.adelbettaiebarctic3.services.ICourseService;

import java.util.List;


@RestController //@RestController est une annotation spécifique dans Spring pour exposer des méthodes HTTP dans une application web de manière RESTful, simplifiant la gestion des API.
@RequestMapping("course")
public class CourseController {
@Autowired // pour injecter les fonction de class au lieu de cree une instance
private ICourseService courseService;


//@RequestBody permet de lier les données du corps de la requête HTTP à un objet Java (dans ce cas, un objet Course).
@PostMapping("add")
    public Course addCourse(@RequestBody Course c ){return  courseService.addCourse(c);}


    @PutMapping("update")
    public Course update(@RequestBody Course c){
        return courseService.update(c);
    }

    @GetMapping("get/{numCourse}")
    public Course retrieveCourse(@PathVariable Long numCourse){
        return courseService.retrieveCourse(numCourse);
    }
    @GetMapping("getall")
    public List<Course> retrieveAll(){

        return courseService.retrieveAll();
    }

    @DeleteMapping ("delete/{numCourse}")
    public void deleteCourse(@PathVariable long numCourse){
        courseService.deleteCourse(numCourse);
    }






}
