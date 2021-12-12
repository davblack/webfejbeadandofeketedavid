package com.example.webbeadando.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.webbeadando.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
//enables operations for Student entity by using JPA repository