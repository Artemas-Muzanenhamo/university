package com.students.studentservice.repository;

import com.students.studentservice.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findStudentsByNameIgnoreCaseContaining(@Param("name") String name);

    List<Student> findStudentsByAge(@Param("age") int age);

    List<Student> findStudentsByAgeAfter(@Param("ageafter") int age);

    List<Student> findStudentsByNameAndSurnameIgnoreCaseContaining(@Param("name") String name, @Param("surname") String surname);

    List<Student> findStudentsByDegreesIgnoreCaseContaining(@Param("degree") String degree);
}
