package com.dev.spring.datajpa.service;

import com.dev.spring.datajpa.model.Hobby;
import com.dev.spring.datajpa.model.Student;
import com.dev.spring.datajpa.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.util.Arrays;


public class StudentServiceTest {

    private StudentService studentService;
    private StudentRepository studentRepository = Mockito.mock(StudentRepository.class);

    @BeforeEach
    void setUp(){
        studentService = new StudentServiceImpl(studentRepository);
    }

    @Test
    void addStudentTest() {
        Student s1 = new Student();
        s1.setId(1L);
        s1.setName("Student");
        s1.setHobbies(
                Arrays.asList(new Hobby(null, "Cricket", s1),
                        new Hobby(null, "Singing", s1))
        );
        Mockito.when(studentRepository.save(ArgumentMatchers.any())).thenReturn(s1);
        Student response = studentService.addStudent(s1);
        Assertions.assertEquals(response,s1);
    }
}
