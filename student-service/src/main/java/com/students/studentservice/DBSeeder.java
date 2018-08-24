package com.students.studentservice;

import com.students.studentservice.model.Student;
import com.students.studentservice.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public DBSeeder(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Student artemas = new Student(
                "Artemas", "Muzanenhamo", 28, Arrays.asList("Software Engineering")
        );

        Student thomas = new Student(
                "Thomas", "Welbeck", 40, Arrays.asList("Computer Science", "Accounting")
        );

        Student william = new Student(
                "William", "Dorothy", 20, Arrays.asList("Pure Mathematics")
        );

        Student james = new Student(
                "James", "Spence", 55, Arrays.asList("Law", "English Literature")
        );

        Student rob = new Student(
                "Rob", "Williams", 30, Arrays.asList("Business Management")
        );

        // Drop the whole existing collection
        this.studentRepository.deleteAll();

        List<Student> students = Arrays.asList(artemas, thomas, william, james, rob);
        this.studentRepository.saveAll(students);
    }
}
