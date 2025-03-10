package tn.esprit.adelbettaiebarctic3.services;

import tn.esprit.adelbettaiebarctic3.entites.Subscription;

import java.util.List;

public interface ISubscriptionService {
    Subscription addSub(Subscription s);
    Subscription update(Subscription s);
    Subscription retrieveSubscription(long numSubscription);
    void deleteSubscription(long numSubscription);
    List<Subscription> retrieveAll();
}
