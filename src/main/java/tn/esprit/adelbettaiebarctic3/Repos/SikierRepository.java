package tn.esprit.adelbettaiebarctic3.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.adelbettaiebarctic3.entites.TypeSubscription;
import tn.esprit.adelbettaiebarctic3.entites.skier;

import java.util.List;

public interface SikierRepository extends JpaRepository<skier,Integer> {
    List<skier> findBySubscription_TypeSubscription(TypeSubscription typeAbonnement);

}
