package com.example.springboot.learnjpaandhibernate.course;

import com.example.springboot.learnjpaandhibernate.course.Course;
import com.example.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.example.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.example.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    /*@Autowired
    private CourseJdbcRepository repository;*/

    /*@Autowired
    private CourseJpaRepository repository;*/

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn Java with maru", "maru"));
        repository.save(new Course(2, "Learn Spring with rafa", "rafa"));
        repository.save(new Course(3, "Learn Javascript with addy", "addy"));
        repository.save(new Course(4, "Learn HTML and CSS with rodrigo", "rodrigo"));
        repository.save(new Course(5, "Learn Python with damian", "damian"));        repository.save(new Course(2, "Learn Spring with rafa", "rafa"));
        repository.save(new Course(6, "Learn Spring Security with rafa", "rafa"));
        repository.save(new Course(7, "Learn Spring Data JPA with rafa", "rafa"));


        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(4l));

        repository.save(new Course (2, "Learn JPA with rafa", "rafa"));
        System.out.println(repository.count());
        System.out.println(repository.findAll());

        System.out.println(repository.findByAuthor("rafa"));

        System.out.println(repository.findByName("Learn HTML and CSS with rodrigo"));
    }
}
