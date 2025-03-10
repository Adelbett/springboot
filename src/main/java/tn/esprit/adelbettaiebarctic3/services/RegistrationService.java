package tn.esprit.adelbettaiebarctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.adelbettaiebarctic3.Repos.RegistrationRepository;
import tn.esprit.adelbettaiebarctic3.entites.Registration;

import java.util.List;
@Service
public class RegistrationService implements  IRegistrationService{
    @Autowired
    private RegistrationRepository RegRepo;
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
}
