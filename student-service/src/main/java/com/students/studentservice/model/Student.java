package com.students.studentservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surname;
    private int age;
    @ElementCollection
    private List<String> subjects;

    public Student() {
    }

    public Student(String name, String surname, int age, List<String> subjects) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}

