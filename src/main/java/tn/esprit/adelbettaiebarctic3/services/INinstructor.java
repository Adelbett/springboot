package tn.esprit.adelbettaiebarctic3.services;

import tn.esprit.adelbettaiebarctic3.entites.Instructor;

import java.util.List;

public interface INinstructor {
    Instructor addInstructor(Instructor In);
    Instructor update(Instructor In);
    Instructor retrieveInstructor(Long numInstructor);
    void deleteInstructor(Long numInstructor);
    List<Instructor> retrieveAll();
}
