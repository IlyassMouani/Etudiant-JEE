package org.example.etudiant.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Seance")
@Data

public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    @Column(name="h_debut")
    private Date h_begin;
    @Column(name="h_fin")
    private Date h_end;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Student> students = new ArrayList<>();

    @ManyToOne
    private Course courses;



}