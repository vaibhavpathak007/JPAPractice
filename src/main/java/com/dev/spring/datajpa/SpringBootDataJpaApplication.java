package com.dev.spring.datajpa;

import com.dev.spring.datajpa.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataJpaApplication{

    private StudentService studentService;

    SpringBootDataJpaApplication(StudentService studentService){
        this.studentService = studentService;
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataJpaApplication.class, args);
    }

//    @Override
//    @Transactional
//    public void run(String... args) throws Exception {
//
//
//        Student s2 = new Student();
//        s2.setName("Vaibhav");
//        s2.setHobbies(
//                Arrays.asList(new Hobby(null, "Cricket", s2),
//                        new Hobby(null, "Singing", s2),
//                        new Hobby(null, "Dancing", s2)));
//        studentService.addStudent(s2);
//
////        Student student = studentRepository.findById(1L).get();
////        List<Hobby> hobbies = student.getHobbies().stream()
////                .map(hobby -> {
////                    if (hobby.getName().equals("Cricket"))
////                        hobby.setName("Crickett");
////                    return hobby;
////                }).collect(Collectors.toList());
////        student.setHobbies(hobbies);
////        studentRepository.save(student);
//    }
}
