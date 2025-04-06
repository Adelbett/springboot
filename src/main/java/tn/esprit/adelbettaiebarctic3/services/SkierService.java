package tn.esprit.adelbettaiebarctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.adelbettaiebarctic3.Repos.PisteRepository;
import tn.esprit.adelbettaiebarctic3.Repos.SikierRepository;
import tn.esprit.adelbettaiebarctic3.entites.Piste;
import tn.esprit.adelbettaiebarctic3.entites.TypeSubscription;
import tn.esprit.adelbettaiebarctic3.entites.skier;

import java.util.List;
@Service
public class SkierService implements ISkierService{

    @Autowired
    private SikierRepository skierRepository;
    @Autowired
    private PisteRepository pisteRepository;

    @Override
    public skier addSkier(skier s) {
        return skierRepository.save(s);
    }

    @Override
    public skier update(skier s) {
        return skierRepository.save(s);
    }

    @Override
    public skier retrieveSkier(int numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public void deleteSkier(int numSkier) {
        skierRepository.deleteById(numSkier);

    }

    @Override
    public List<skier> retrieveAll() {
        return  skierRepository.findAll();
    }

    @Override
    public skier assignSkierToPiste(Long numSkier, Long numPiste) {
        skier skier = skierRepository.findById(Math.toIntExact(numSkier)).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        if (skier != null && piste != null) {
            skier.getPistes().add(piste);
            piste.getSkiers().add(skier);
        }
        return skierRepository.save(skier);
    }

    @Override
    public List<skier> findBySubscription_TypeSubscription(TypeSubscription typeAbonnement) {
        return skierRepository.findBySubscription_TypeSubscription(typeAbonnement);
    }

}
