package com.SpringRestApplication.topics;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by user on 12-Jan-17.
 */
@Entity
public class Topic implements Serializable {

    @Id
    private String Id;
    private String name;
    private String description;


    public Topic() {
    }

    public Topic(String id, String name, String description) {
        Id = id;
        this.name = name;
        this.description = description;
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
