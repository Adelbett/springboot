package tn.esprit.adelbettaiebarctic3.entites;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Piste implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  long numpiste ;
    private  String pistename;
    @Enumerated(EnumType.STRING)
    private color color;
    private int length;
    private  int slope;

    @ManyToMany
    Set<skier> skiers;  //avoir primary key dans la table associative



}
