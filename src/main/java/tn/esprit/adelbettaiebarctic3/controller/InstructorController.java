package tn.esprit.adelbettaiebarctic3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.adelbettaiebarctic3.entites.Instructor;
import tn.esprit.adelbettaiebarctic3.services.INinstructor;

import java.util.List;
@RestController
@RequestMapping("Instructor")
public class InstructorController {
    @Autowired
    private INinstructor InService;

    @PostMapping("add")
    public Instructor addInstructor(@RequestBody Instructor In){
        return InService.addInstructor(In);
    }

    @PutMapping("update")
    public Instructor update(@RequestBody Instructor In){
        return InService.update(In);
    }

    @GetMapping("get/{numInstructor}")
    public Instructor retrieveInstructor(@PathVariable Long numInstructor){
        return InService.retrieveInstructor(numInstructor);
    }

    @GetMapping("getall")
    public List<Instructor> retrieveAll(){

        return InService.retrieveAll();
    }

    @DeleteMapping ("delete/{numInstructor}")
    public void deleteInstructor(@PathVariable Long numInstructor){
        InService.deleteInstructor(numInstructor);
    }
}
