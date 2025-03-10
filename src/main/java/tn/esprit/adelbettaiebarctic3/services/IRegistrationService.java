package tn.esprit.adelbettaiebarctic3.services;

import tn.esprit.adelbettaiebarctic3.entites.Registration;

import java.util.List;

public interface IRegistrationService {
    Registration addReg(Registration reg);
    Registration update(Registration reg);
    Registration retrieveRegistration(Long numRegistration);
    void deleteRegistration(Long numRegistration);
    List<Registration> retrieveAll();


}
