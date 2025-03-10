package tn.esprit.adelbettaiebarctic3.entites;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Getter
@Setter

public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInstructor;
    private String firstName;
    private String lastName ;
    private LocalDate dateOfHire ;

    @OneToMany( )
    List<Course> Course;

}
