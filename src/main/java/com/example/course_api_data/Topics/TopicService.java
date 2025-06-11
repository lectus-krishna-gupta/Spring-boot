package com.example.course_api_data.Topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private topicrepository Topicrepository;


        public List<topic> getAllTopics () {
            List<topic> topics = new ArrayList<>();
            Topicrepository.findAll().forEach(topics::add);
            return topics;

        }


    public Optional<topic> getTopics(String id) {
        return Topicrepository.findById(id);
    }


        public void addTopic (topic topic){
//            topics.add(topic);
            Topicrepository.save(topic);
        }


        public void updateTopic (String id, topic topic){
//            for (int i = 0; i < topics.size(); i++) {
//                topic t = topics.get(i);
//                if (t.getId().equals(id)) {
//                    topics.set(i, topic);
//                    return;
//                }
//            }

            Topicrepository.save(topic);
        }

       public void deleteTopic(String id) {
        Topicrepository.deleteById(id);
    }



}




