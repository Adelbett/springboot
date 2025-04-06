package tn.esprit.adelbettaiebarctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.adelbettaiebarctic3.Repos.CourseRepository;
import tn.esprit.adelbettaiebarctic3.Repos.RegistrationRepository;
import tn.esprit.adelbettaiebarctic3.Repos.SikierRepository;
import tn.esprit.adelbettaiebarctic3.entites.Course;
import tn.esprit.adelbettaiebarctic3.entites.Registration;
import tn.esprit.adelbettaiebarctic3.entites.skier;
import tn.esprit.adelbettaiebarctic3.entites.typeCourse;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
@Service
public class RegistrationService implements  IRegistrationService{
    @Autowired
    private RegistrationRepository RegRepo;
    @Autowired
    private CourseRepository courseRep;
    @Autowired
    private SikierRepository skiRep;



    @Override
    public Registration addReg(Registration reg) {
        return RegRepo.save(reg);
    }

    @Override
    public Registration update(Registration reg) {
        return RegRepo.save(reg);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return RegRepo.findById(numRegistration).orElse(null);
    }

    @Override
    public void deleteRegistration(Long numRegistration) {
        RegRepo.deleteById(numRegistration);

    }

    @Override
    public List<Registration> retrieveAll() {
        return RegRepo.findAll();
    }


    @Override
    public Registration assignRegistrationToCourse(Long numRegistration, Long numCourse) {
        Registration reg = RegRepo.findById
                (numRegistration).orElse(null);
        Course course = courseRep.findById(numCourse).orElse(null);
        if(reg != null && course != null) {
            reg.setC(course);
            course.getRegistrations().add(reg);
        }
        return RegRepo.save(reg) ;
    }

    @Override
    public Registration addRegistrationAndAssignToSkierAndCourse(Registration registration, Long numSkier, Long numCourse) {


        skier skier = skiRep.findById(Math.toIntExact(numSkier))
                .orElseThrow(() -> new IllegalArgumentException("Skier with ID " + numSkier + " not found"));

        Course course = courseRep.findById(numCourse)
                .orElseThrow(() -> new IllegalArgumentException("Course with ID " + numCourse + " not found"));

        int maxNbSkPerCourse = 6;
        int ageSk = Period.between(skier.getDataOfBrith(), LocalDate.now()).getYears();
        typeCourse typeCourse = course.getTypeCourse();


        if (course.getRegistrations().size() >= maxNbSkPerCourse) {
            throw new IllegalStateException("The course with ID " + numCourse + " is full (max " + maxNbSkPerCourse + " skiers allowed).");
        }


        if (ageSk < 18 && typeCourse != typeCourse.COLLECTIVE_CHILDREN) {
            throw new IllegalArgumentException("A child cannot be registered in an adult course.");
        }
        if (ageSk >= 18 && typeCourse != typeCourse.COLLECTIVE_ADULT) {
            throw new IllegalArgumentException("An adult cannot be registered in a children’s course.");
        }


        registration.setC(course);
        registration.setC(course);
        return RegRepo.save(registration);
    }
}
