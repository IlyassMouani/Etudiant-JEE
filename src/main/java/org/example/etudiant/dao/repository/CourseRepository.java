package org.example.etudiant.dao.repository;

import org.example.etudiant.dao.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
