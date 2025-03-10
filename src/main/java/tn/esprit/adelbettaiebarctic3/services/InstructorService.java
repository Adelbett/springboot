package tn.esprit.adelbettaiebarctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.adelbettaiebarctic3.Repos.InstructorRepository;
import tn.esprit.adelbettaiebarctic3.entites.Instructor;

import java.util.List;
@Service
public class InstructorService implements INinstructor {
    @Autowired
    private InstructorRepository InRepo;
    @Override
    public Instructor addInstructor(Instructor In) {
        return  InRepo.save(In);

    }

    @Override
    public Instructor update(Instructor In) {
        return  InRepo.save(In);    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return InRepo.findById(numInstructor).orElse(null);
    }

    @Override
    public void deleteInstructor(Long numInstructor) {
        InRepo.deleteById(numInstructor);

    }

    @Override
    public List<Instructor> retrieveAll() {
        return InRepo.findAll();
    }

}
