package com.SpringRestApplication.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 12-Jan-17.
 */
@Service
public class TopicService {


    @Autowired
    private TopicRepository topicRepository;


    List<Topic> topicList = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Core Java", "Core Java Description"),
            new Topic("Python", "Core Python", "Core Python Description"),
            new Topic("C#", "Core C#", "Core C# Description")));

    public List<Topic> getAllTopics() {

        return (List<Topic>) topicRepository.findAll();
    }

    public Topic getTopicById(String name) {

        return topicRepository.findOne(name);
    }

    public void addTopic(Topic topic) {

        topicRepository.save(topic);

    }

    public void updateTopicById(Topic topic) {

        topicRepository.save(topic);
    }

    public void deleteTopicById(String name) {


        topicRepository.delete(name);

    }
}
