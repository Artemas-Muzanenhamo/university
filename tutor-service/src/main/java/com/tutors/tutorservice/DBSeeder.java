package com.tutors.tutorservice;

import com.tutors.tutorservice.domain.Tutor;
import com.tutors.tutorservice.repository.TutorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {

    private final TutorRepository tutorRepository;

    public DBSeeder(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Tutor martin = new Tutor("Martin", "Lawrence", Arrays.asList("Software Engineering", "Computer Sciences"));
        Tutor thomas = new Tutor("Thomas", "Jefferson", Arrays.asList("Mathematics"));
        Tutor cassie = new Tutor("Cassie", "James", Arrays.asList("Law"));
        Tutor sandy = new Tutor("Sandy", "Malik", Arrays.asList("Criminal Law", "Judicial Law"));
        Tutor rob = new Tutor("Robert", "Gabriel", Arrays.asList("Geology"));

        // Delete all previous data before we use any data
        this.tutorRepository.deleteAll();

        // Add new data to use
        List<Tutor> tutors = Arrays.asList(martin, thomas, cassie, sandy, rob);
        this.tutorRepository.saveAll(tutors);
    }
}
