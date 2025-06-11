package com.example.course_api_data.Course;

import com.example.course_api_data.Topics.topic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String des;

    @ManyToOne
    private topic topic;

    public Course() {
    }

    public Course(String id, String name, String des, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.des = des;
        this.topic = new topic(topicId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public topic getTopic() {
        return topic;
    }

    public void setTopic(topic topic) {
        this.topic = topic;
    }
}
