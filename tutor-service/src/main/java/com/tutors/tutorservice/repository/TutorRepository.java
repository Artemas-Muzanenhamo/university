package com.tutors.tutorservice.repository;

import com.tutors.tutorservice.domain.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, String> {
}
