package tn.esprit.adelbettaiebarctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.adelbettaiebarctic3.Repos.SikierRepository;
import tn.esprit.adelbettaiebarctic3.entites.skier;

import java.util.List;
@Service
public class SkierService implements ISkierService{

    @Autowired
    private SikierRepository skierRepository;

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

}
