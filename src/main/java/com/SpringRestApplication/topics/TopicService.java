package com.SpringRestApplication.topics;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 12-Jan-17.
 */
@Service
public class TopicService {


    List<Topic> topicList = Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Core Java", "Core Java Description"),
            new Topic("Python", "Core Python", "Core Python Description"),
            new Topic("C#", "Core C#", "Core C# Description"));

    public List<Topic> getAllTopics() {
        return topicList;

    }

    public Topic getTopicById(String name) {
        return topicList.stream().filter(t -> t.getId().equals(name)).findFirst().get();

    }
}
