package com.example.springrestapi.service;

import com.example.springrestapi.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(Long courseId);

    public Course addCourse(Course course);

    public Course updateCourse( Course Course);

    public void deleteCourse(long parseLong);

}
