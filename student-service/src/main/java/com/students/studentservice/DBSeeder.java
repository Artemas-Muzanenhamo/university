package com.students.studentservice;

import com.students.studentservice.domain.Student;
import com.students.studentservice.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DBSeeder implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public DBSeeder(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Map<String, String> artemasDegree = new HashMap<>();

        Student artemas = new Student(
                "Artemas", "Muzanenhamo", 28, new HashMap<String, String>() {
                    {
                        put("Software Engineering", "BSc");
                    }
                }

        );

        Student thomas = new Student(
                "Thomas", "Welbeck", 40, new HashMap<String, String>() {
                    {
                        put("Computer Science", "BSc");
                        put("Accounting", "MSc");
                    }
                }
        );

        Student william = new Student(
                "William", "Dorothy", 20, new HashMap<String, String>() {
                    {
                        put("Geology", "BSc");
                    }
                }
        );

        Student james = new Student(
                "James", "Spence", 55, new HashMap<String, String>() {
                    {
                        put("Law", "BSc");
                        put("Criminal Law", "MSc");
                        put("Judicial Law", "PHD");
                    }
                }
        );

        Student rob = new Student(
                "Rob", "Williams", 30, new HashMap<String, String>() {
                    {
                        put("Pure Mathematics", "BSc");
                    }
                }
        );

        // Drop the whole existing collection
        this.studentRepository.deleteAll();

        List<Student> students = Arrays.asList(artemas, thomas, william, james, rob);
        this.studentRepository.saveAll(students);
    }
}
