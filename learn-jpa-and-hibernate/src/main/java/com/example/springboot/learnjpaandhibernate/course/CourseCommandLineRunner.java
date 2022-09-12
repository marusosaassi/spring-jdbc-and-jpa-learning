package com.example.springboot.learnjpaandhibernate.course;

import com.example.springboot.learnjpaandhibernate.course.Course;
import com.example.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.example.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    /*@Autowired
    private CourseJdbcRepository repository;*/

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn Java with maru", "maru"));
        repository.insert(new Course(2, "Learn Spring with rafa", "rafa"));
        repository.insert(new Course(3, "Learn Javascript with addy", "addy"));
        repository.insert(new Course(4, "Learn HTML and CSS with rodrigo", "rodrigo"));
        repository.insert(new Course(5, "Learn Python with damian", "damian"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(4));
    }
}
