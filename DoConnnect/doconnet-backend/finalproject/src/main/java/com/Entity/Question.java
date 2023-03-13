package com.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "Question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String description_question;
    private String image_src;
    private String datetime;
    private String status;
    private String topic;
    private String title;
    @OneToMany(mappedBy = "question", fetch=FetchType.EAGER)
    @JsonIgnore
    private List<Answer> answers;

    public Question() {
    }

    public Question(int id, String description_question, String image_src, String datetime, String status, String topic, String title, List<Answer> answers) {
        this.id = id;
        this.description_question = description_question;
        this.image_src = image_src;
        this.datetime = datetime;
        this.status = status;
        this.topic = topic;
        this.title = title;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription_question() {
        return description_question;
    }

    public void setDescription_question(String description_question) {
        this.description_question = description_question;
    }

    public String getImage_src() {
        return image_src;
    }

    public void setImage_src(String image_src) {
        this.image_src = image_src;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}


