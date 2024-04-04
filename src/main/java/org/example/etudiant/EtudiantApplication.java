package org.example.etudiant;


import org.example.etudiant.dao.entities.Student;
import org.example.etudiant.dao.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EtudiantApplication implements CommandLineRunner {

        @Autowired
        private StudentRepository studentRepository;
        public static void main(String[] args) {
            SpringApplication.run(EtudiantApplication.class, args);
        }
        @Override
        public void run(String... args) throws Exception {
            Student student = new Student(2,"Ilyass","X");
            studentRepository.save(student);

        }



}
