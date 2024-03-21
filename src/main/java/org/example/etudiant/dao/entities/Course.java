package org.example.etudiant.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Cours")
@Data

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="titre")
    private String title;
    private String description;

    @OneToMany(mappedBy = "courses")
    private Collection<Session> sessions = new ArrayList<>();

    @OneToOne
    private Teacher teachers;


}