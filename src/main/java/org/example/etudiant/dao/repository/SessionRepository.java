package org.example.etudiant.dao.repository;

import org.example.etudiant.dao.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Integer> {
}
