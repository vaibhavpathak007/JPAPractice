package com.dev.spring.datajpa.repository;

import com.dev.spring.datajpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
