package com.SpringRestApplication.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/topics", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void addTopics(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }


    @RequestMapping(value = "/topics", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void updateTopicById(@RequestBody Topic topic) {
        topicService.updateTopicById(topic);
    }


    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopicById(@PathVariable("id") String name) {
        topicService.deleteTopicById(name);
    }


}
