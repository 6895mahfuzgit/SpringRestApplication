package com.SpringRestApplication.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 12-Jan-17.
 */
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;


    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable("id") String name) {
        return topicService.getTopicById(name);
    }


}
