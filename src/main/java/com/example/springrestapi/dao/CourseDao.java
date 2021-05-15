package com.example.springrestapi.dao;

import com.example.springrestapi.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface CourseDao  extends JpaRepository<Course, Long> {

}
