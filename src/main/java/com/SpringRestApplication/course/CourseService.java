package com.SpringRestApplication.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 12-Jan-17.
 */
@Service
public class CourseService {


    @Autowired
    private CourseRepository courseRepository;

/*
    List<Course> topicList = new ArrayList<>(Arrays.asList(
            new Course("Spring", "Spring Framework", "Spring Framework Description"),
            new Course("Java", "Core Java", "Core Java Description"),
            new Course("Python", "Core Python", "Core Python Description"),
            new Course("C#", "Core C#", "Core C# Description")));*/

    public List<Course> getAllCourses(String id) {

        return (List<Course>)courseRepository.findByTopicId(id);
    }

    public Course getCourseById(String name) {

        return courseRepository.findOne(name);
    }

    public void addCourse(Course course) {

        courseRepository.save(course);

    }

    public void updateCourseById(Course course) {

        courseRepository.save(course);
    }

    public void deleteCourseById(String name) {


        courseRepository.delete(name);

    }
}
