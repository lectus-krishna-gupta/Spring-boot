package com.example.course_api_data.Topics;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class topic {

    @Id
    private String id;
    private String name;
    private String des;


    public topic(){

    }


    public topic(String id,String name, String des){
        super();
        this.id = id;
        this.name = name;
        this.des = des;
    };

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = this.name;
    }

    public String getDes(){
        return des;
    }

    public void setDes(String des){
        this.des = des;
    }
}
