package com.Entity;

import javax.persistence.*;

@Entity
@Table(name= "Answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String description_answer;
    private String img_src;
    private String status;
    private String datetime;
    @ManyToOne
    private Question question;

    public Answer() {
    }

    public Answer(int id, String description_answer, String img_src, String status, String datetime, Question question) {
        this.id = id;
        this.description_answer = description_answer;
        this.img_src = img_src;
        this.status = status;
        this.datetime = datetime;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription_answer() {
        return description_answer;
    }

    public void setDescription_answer(String description_answer) {
        this.description_answer = description_answer;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
