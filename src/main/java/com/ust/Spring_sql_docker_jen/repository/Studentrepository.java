package com.ust.Spring_sql_docker_jen.repository;

import com.ust.Spring_sql_docker_jen.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository extends JpaRepository<Student,Long> {
}
