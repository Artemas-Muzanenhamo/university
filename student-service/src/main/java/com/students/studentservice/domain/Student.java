package com.students.studentservice.domain;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surname;
    private int age;
    @ElementCollection
    private Map<String, String> degrees;

    public Student() {
    }

    public Student(String name, String surname, int age, Map<String, String> degrees) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.degrees = degrees;
    }

    public Integer getId() {
        return id;
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

    public Map<String, String> getDegrees() {
        return degrees;
    }

    @Override
    public boolean equals(Object o) {





        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (!id.equals(student.id)) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (surname != null ? !surname.equals(student.surname) : student.surname != null) return false;
        return degrees != null ? degrees.equals(student.degrees) : student.degrees == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (degrees != null ? degrees.hashCode() : 0);
        return result;
    }
}

