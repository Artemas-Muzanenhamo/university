package com.students.studentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String id;
    private String name;
    private String surname;
    private int age;
    private List<String> subjects;
}
