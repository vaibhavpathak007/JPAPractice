package com.dev.spring.datajpa;

import com.dev.spring.datajpa.service.StudentService;
import com.dev.spring.datajpa.service.StudentServiceImpl;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

// All beans required to mock will be register here
@TestConfiguration
public class AllServiceRegistryConfig {

    @Bean
    public StudentService getStudentService(){
        return new StudentServiceImpl(null);
    }

}
