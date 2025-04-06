package tn.esprit.adelbettaiebarctic3.services;

import tn.esprit.adelbettaiebarctic3.entites.Subscription;
import tn.esprit.adelbettaiebarctic3.entites.TypeSubscription;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface ISubscriptionService {
    Subscription addSub(Subscription s);
    Subscription update(Subscription s);
    Subscription retrieveSubscription(long numSubscription);
    void deleteSubscription(long numSubscription);
    List<Subscription> retrieveAll();
    Set<Subscription> getSubscriptionByTypeSub(TypeSubscription type);
    List<Subscription> findSubscriptionsByDates(LocalDate startDate, LocalDate endDate);
}
