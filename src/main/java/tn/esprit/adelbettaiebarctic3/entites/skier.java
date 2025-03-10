package tn.esprit.adelbettaiebarctic3.entites;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Getter
@Setter
public class skier implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  long numSiker ;
private String firstName ;
private  String lastName ;
private LocalDate dataOfBrith;
private  String city;
@OneToOne (mappedBy = "skier")
 Subscription Subscription ;
 @OneToMany(mappedBy = "Sk")
 List<Registration> registrations;


 @OneToOne(cascade = {CascadeType.PERSIST , CascadeType.REMOVE})
 Subscription S;
 @ManyToMany(mappedBy = "skiers")
 Set<Piste> pistes;




}
