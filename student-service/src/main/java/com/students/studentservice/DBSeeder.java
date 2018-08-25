package com.students.studentservice;

import com.students.studentservice.domain.Student;
import com.students.studentservice.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
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
                "Artemas", "Muzanenhamo", 28, new HashMap<String, String>() {
            {
                put("BSc", "Software Engineering");
            }
        }

        );

        Student thomas = new Student(
                "Thomas", "Welbeck", 40, new HashMap<String, String>() {
            {
                put("BSc", "Computer Science");
                put("MSc", "Accounting");
            }
        }
        );

        Student william = new Student(
                "William", "Dorothy", 20, new HashMap<String, String>() {
            {
                put("BSc", "Geology");
            }
        }
        );

        Student james = new Student(
                "James", "Spence", 55, new HashMap<String, String>() {
            {
                put("BSc", "Law");
                put("MSc", "Criminal Law");
                put("PHD", "Judicial Law");
            }
        }
        );

        Student rob = new Student(
                "Rob", "Williams", 30, new HashMap<String, String>() {
            {
                put("BSc", "Pure Mathematics");
            }
        }
        );

        // Drop the whole existing collection
        this.studentRepository.deleteAll();

        List<Student> students = Arrays.asList(artemas, thomas, william, james, rob);
        this.studentRepository.saveAll(students);
    }
}
