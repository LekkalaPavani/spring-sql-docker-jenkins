package com.ust.Spring_sql_docker_jen.service;

import com.ust.Spring_sql_docker_jen.model.Student;
import com.ust.Spring_sql_docker_jen.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservice {
    @Autowired
    private Studentrepository repo;

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
