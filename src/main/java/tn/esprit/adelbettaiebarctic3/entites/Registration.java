package tn.esprit.adelbettaiebarctic3.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long numRegistration;
    private  int numWeek;
    @ManyToOne
    skier Sk;
    @ManyToOne
    Course C;



}
