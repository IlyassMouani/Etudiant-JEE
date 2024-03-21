package org.example.etudiant.dao.repository;

import org.example.etudiant.dao.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
