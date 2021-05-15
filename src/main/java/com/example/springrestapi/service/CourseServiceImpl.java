package com.example.springrestapi.service;

import com.example.springrestapi.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

    private List<Course> list;

    public CourseServiceImpl() {
        list  = new ArrayList<>();
        list.add(new Course(101L, "Java","Basic of Java"));
        list.add(new Course(102L,"Python","Basic Python"));

    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(Long courseId) {
        Course c = null;
        for(Course course: list){
            if(course.getId()== courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        list.forEach(e->{
            if(e.getId() == course.getId()){
                e.setTitle(course.getTitle());
                e.setDescription(course.getDescription());
            }
        });
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        list = this.list.stream().filter(e->e.getId() != parseLong).collect(Collectors.toList());
    }
}
