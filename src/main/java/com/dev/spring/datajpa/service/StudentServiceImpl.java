package com.dev.spring.datajpa.service;

import com.dev.spring.datajpa.model.Student;
import com.dev.spring.datajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Transactional
    @Override
    public Student addStudent(Student s) {
//        s.getHobbies().forEach(hobby -> hobby.setStudent(s));
        return studentRepository.save(s);
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

}
