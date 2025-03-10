package tn.esprit.adelbettaiebarctic3.entites;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Getter
@Setter

public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long numCourse ;
    private  int level ;
    @Enumerated(EnumType.STRING)
    private  typeCourse  typeCourse;
    @Enumerated(EnumType.STRING)
    private  Support Support;
    private float price ;
    private int timeSlot ;
@OneToMany(mappedBy = "C")
List<Registration> registrations;
    @ManyToOne()
    Instructor instructor;


}
