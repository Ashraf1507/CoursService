package com.example.courseservice.controller;

import com.example.courseservice.entity.Course;
import com.example.courseservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/cours")
    @CrossOrigin("*")
    public void saveCourse(@RequestBody Course course){
        courseService.saveCourse(course);
    }

    @GetMapping("/cours")
    public List<Course> showCourses(){
        return  courseService.findAll();
    }

    @GetMapping("/cours/{id}")
    public Course findCourseById(@PathVariable int id){
        return courseService.findCourseById(id);
    }

    @PutMapping("/cours/{id}")
    public void updateCourse(@RequestBody Course course){
        System.out.println(course);
        courseService.saveCourse(course);
    }

    @DeleteMapping("/cours/{id}")
    public void deleteCourse(Course course){
        courseService.deleteCourse(course);
    }

}
