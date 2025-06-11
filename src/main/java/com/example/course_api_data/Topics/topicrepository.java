package com.example.course_api_data.Topics;


import org.springframework.data.repository.CrudRepository;

public interface topicrepository extends CrudRepository<topic, String> {
//    topic findOne(String id);
}

