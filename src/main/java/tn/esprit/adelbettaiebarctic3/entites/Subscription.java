package tn.esprit.adelbettaiebarctic3.entites;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Getter
@Setter
public class Subscription implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSub;
    private LocalDate startDate;
    private LocalDate endDate;
    private Float price;
@Enumerated(EnumType.STRING)
private  TypeSubscription typeSub;
@OneToOne //parent
    skier skier;
}
