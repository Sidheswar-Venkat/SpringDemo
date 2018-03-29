package com.sidheswar.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class Student {

    private UUID id;
    private final Integer age;
    private final String firstName;
    private final String lastName;
    private final String course;
    // intellija tip : alt+enter to create constructor

    public Student(
            @JsonProperty("id") UUID id,
            @JsonProperty("age") Integer age,
            @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName") String lastName,
            @JsonProperty("course") String course) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    // intellija tip : alt+insert to insert getter methods
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }
}
