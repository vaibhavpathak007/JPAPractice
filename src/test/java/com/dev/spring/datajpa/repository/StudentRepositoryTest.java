package com.dev.spring.datajpa.repository;

import com.dev.spring.datajpa.AllServiceRegistryConfig;
import com.dev.spring.datajpa.model.Hobby;
import com.dev.spring.datajpa.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.Arrays;


//@SpringBootTest <- Starts entire application (heavy).
// OR use
@DataJpaTest // <- It only loads Beans having @Repository
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE) // <- Default H2 db overridden by App used.
@Import(AllServiceRegistryConfig.class) // Mock all used bean in app
public class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void saveTest(){
        Student s = new Student();
        s.setName("Vaibhav");
        s.setHobbies(
                Arrays.asList(new Hobby(null, "Cricket", s),
                        new Hobby(null, "Singing", s),
                        new Hobby(null, "Dancing", s)));
        Student response = studentRepository.save(s);
        Assertions.assertNotNull(response.getId());
    }

}
