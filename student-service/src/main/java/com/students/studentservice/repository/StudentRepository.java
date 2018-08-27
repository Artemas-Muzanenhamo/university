package com.students.studentservice.repository;

import com.students.studentservice.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findStudentsByNameIgnoreCaseContaining(@Param("name") String name);

    List<Student> findStudentsByAge(@Param("age") int age);

    List<Student> findStudentsByAgeAfter(@Param("ageafter") int age);

    List<Student> findStudentsByNameIgnoreCaseContainingAndSurnameIgnoreCaseContaining(@Param("name") String name, @Param("surname") String surname);

    List<Student> findStudentsByDegreesIgnoreCaseContaining(@Param("degree") String degree);

    Student findFirstByNameIgnoreCaseContaining(@Param("name") String name);

    @Override
    @RestResource(exported = false)
    void delete(Student student);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
