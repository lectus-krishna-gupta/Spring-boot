package com.example.course_api_data.Course;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Courserepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);
//    public List<Course> findByName(String name);
//    public List<Course> findByDes(String des);
}

