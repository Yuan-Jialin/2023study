package com.yuan.pojo;

import java.util.*;

public class YangFan {

       private Student student;
       private ArrayList<String>hoppy;
       private Student []friends;
       private Map<String,Integer>score;
       private Set<String>books;
       private String Null;
       private Properties properties;

    public ArrayList<String> getHoppy() {
        return hoppy;
    }

    public void setHoppy(ArrayList<String> hoppy) {
        this.hoppy = hoppy;
    }

    public Student[] getFriends() {
        return friends;
    }

    public void setFriends(Student[] friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getScore() {
        return score;
    }

    public void setScore(Map<String, Integer> score) {
        this.score = score;
    }

    public Set<String> getBooks() {
        return books;
    }

    public void setBooks(Set<String> books) {
        this.books = books;
    }

    public String getNull() {
        return Null;
    }

    public void setNull(String aNull) {
        Null = aNull;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "YangFan{" +
                "student=" + student +
                ", hoppy=" + hoppy +
                ", friends=" + Arrays.toString(friends) +
                ", score=" + score +
                ", books=" + books +
                ", Null='" + Null + '\'' +
                ", properties=" + properties +
                '}';
    }
}
