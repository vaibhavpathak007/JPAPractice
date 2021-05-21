package com.dev.spring.datajpa.service;

import com.dev.spring.datajpa.model.Student;

import java.util.List;

public interface StudentService {
    public Student addStudent(Student s);

    public List<Student> getAllStudents();
}
