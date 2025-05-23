package tn.esprit.adelbettaiebarctic3.services;

import tn.esprit.adelbettaiebarctic3.entites.TypeSubscription;
import tn.esprit.adelbettaiebarctic3.entites.skier;

import java.util.List;

public interface ISkierService {
    skier addSkier(skier s);
    skier update(skier s);
    skier retrieveSkier(int numSkier);
    void deleteSkier(int numSkier);
    List<skier> retrieveAll();
    skier assignSkierToPiste(Long numSkier, Long numPiste);
    List<skier> findBySubscription_TypeSubscription(TypeSubscription typeAbonnement);

}
