package com.SpringRestApplication.course;

import com.SpringRestApplication.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by user on 12-Jan-17.
 */
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;


    @RequestMapping(value = "/topics/{id}/courses")
    public List<Course> getAllTopics(@PathVariable String id) {
        return courseService.getAllCourses(id);
    }

    @RequestMapping(value = "/topics/{topicsId}/cources/{id}")
    public Course getCourseById(@PathVariable("id") String name) {
        return courseService.getCourseById(name);
    }

    @RequestMapping(value = "/topics{topicsId}/cources/{id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addCourse(@RequestBody Course course, @PathVariable String topicsId) {


        course.setTopic(new Topic(topicsId, "", ""));
        courseService.addCourse(course);
    }


    @RequestMapping(value = "/topics{topicsId}/cources/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void updateTopicById(@RequestBody Course course, @PathVariable String topicsId, @PathVariable String id) {

        course.setTopic(new Topic(topicsId, "", ""));
        courseService.updateCourseById(course);
    }


    @RequestMapping(value = "/topics{topicsId}/cources/{id}", method = RequestMethod.DELETE)
    public void deleteTopicById(@PathVariable("id") String name) {
        courseService.deleteCourseById(name);
    }


}
