package org.example.etudiant.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Etudiant")
@Data

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nom")
    private String name;
    private String matricule;
    public Student(int id,String name, String matricule){
        this.id=id;
        this.name=name;
        this.matricule=matricule;

    }
    @ManyToMany(mappedBy = "students", fetch = FetchType.EAGER)
    private Collection<Session> sessions = new ArrayList<>();


}
