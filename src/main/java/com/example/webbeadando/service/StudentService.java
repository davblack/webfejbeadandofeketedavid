package com.example.webbeadando.service;
import java.util.List;
import com.example.webbeadando.model.Student;

public interface StudentService {
    List < Student > getAllStudents();
    void saveStudent(Student student);
    Student getStudentById(long id);
    void deleteStudentById(long id);
}