package com.SpringRestApplication.course;

import com.SpringRestApplication.topics.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by user on 12-Jan-17.
 */
@Entity
public class Course implements Serializable {

    @Id
    private String Id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;


    public Course() {
    }

    public Course(String id, String name, String description, String topicId) {
        Id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
