package com.example.courseservice.service;

import com.example.courseservice.entity.Course;
import com.example.courseservice.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAll(){
        return courseRepository.findAll();
    }
    public void saveCourse(Course course){
         courseRepository.save(course);
    }

    public Course findCourseById(int id){
        return courseRepository.findById(id);
    }
    public void deleteCourse(Course course){
        courseRepository.delete(course);
    }

}
