package tn.esprit.adelbettaiebarctic3.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.adelbettaiebarctic3.entites.Subscription;
import tn.esprit.adelbettaiebarctic3.entites.TypeSubscription;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface subscriptionRepository extends JpaRepository<Subscription,Long> {
    Set<Subscription> getSubscriptionByTypeSub(TypeSubscription type);
    List<Subscription> findByStartDateGreaterThanEqualAndEndDateLessThanEqual(  LocalDate startDate, LocalDate endDate);

}
