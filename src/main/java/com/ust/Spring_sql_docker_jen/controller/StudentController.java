package com.ust.Spring_sql_docker_jen.controller;

import com.ust.Spring_sql_docker_jen.model.Student;
import com.ust.Spring_sql_docker_jen.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private Studentservice service;
    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }


    @GetMapping("/getstudents")
    public List<Student> getStudents(){
        return service.getStudents();

    }



}



