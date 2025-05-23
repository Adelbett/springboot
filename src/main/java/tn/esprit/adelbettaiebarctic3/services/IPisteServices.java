package tn.esprit.adelbettaiebarctic3.services;

import tn.esprit.adelbettaiebarctic3.entites.Piste;

import java.util.List;

public interface IPisteServices {
    Piste addPiste(Piste p);
    Piste update(Piste p);
    Piste retrievePiste(Long numPiste);
    void deletePiste(Long numPiste);
    List<Piste> retrieveAll();
}
