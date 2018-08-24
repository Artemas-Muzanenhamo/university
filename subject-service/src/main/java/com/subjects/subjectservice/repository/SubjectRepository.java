package com.subjects.subjectservice.repository;

import com.subjects.subjectservice.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, String> {
}
