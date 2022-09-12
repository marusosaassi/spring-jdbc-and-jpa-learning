package com.example.springboot.learnjpaandhibernate.course.jdbc;

import com.example.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS with maru", "maru"));
        repository.insert(new Course(2, "Learn Java with rafa", "rafa"));
        repository.insert(new Course(3, "Learn Spring with addy", "addy"));
        repository.insert(new Course(4, "Learn Frontend with rodrigo", "rodrigo"));
        repository.insert(new Course(5, "Learn Python with damian", "damian"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(4));
    }
}
