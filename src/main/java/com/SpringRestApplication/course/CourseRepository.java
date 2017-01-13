package com.SpringRestApplication.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by user on 13-Jan-17.
 */
public interface CourseRepository extends CrudRepository<Course,String> {

    List<Course> findByTopicId(String topicId);
}
