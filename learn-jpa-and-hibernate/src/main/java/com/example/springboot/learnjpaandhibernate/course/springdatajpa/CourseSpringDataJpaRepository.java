package com.example.springboot.learnjpaandhibernate.course.springdatajpa;

import com.example.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
