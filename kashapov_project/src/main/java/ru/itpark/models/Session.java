package ru.itpark.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;


@Entity

public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codeSession;
    private String subject;
    private String teacher;
    private String group;
    private String exam;
    private int dateOfExam;
    private int rating;

    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Session> sessionsList;

    public int getCodeSession() {
        return codeSession;
    }

    public void setCodeSession(int codeSession) {
        this.codeSession = codeSession;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public int getDateOfExam() {
        return dateOfExam;
    }

    public void setDateOfExam(int dateOfExam) {
        this.dateOfExam = dateOfExam;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<Session> getSessionsList() {
        return sessionsList;
    }

    public void setSessionsList(List<Session> sessionsList) {
        this.sessionsList = sessionsList;
    }
}


