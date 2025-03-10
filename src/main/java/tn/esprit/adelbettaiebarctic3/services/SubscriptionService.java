package tn.esprit.adelbettaiebarctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.adelbettaiebarctic3.Repos.subscriptionRepository;
import tn.esprit.adelbettaiebarctic3.entites.Subscription;

import java.util.List;

@Service
public class SubscriptionService implements  ISubscriptionService{
    @Autowired
    private subscriptionRepository subRepo;
    @Override
    public Subscription addSub(Subscription s) {
        return subRepo.save(s);
    }

    @Override
    public Subscription update(Subscription s) {
        return subRepo.save(s);
    }

    @Override
    public Subscription retrieveSubscription(long numSubscription) {
        return subRepo.findById(numSubscription).orElse(null);
    }


    @Override
    public void deleteSubscription(long numSubscription) {
        subRepo.deleteById(numSubscription);

    }

    @Override
    public List<Subscription> retrieveAll() {
        return subRepo.findAll();
    }
}
