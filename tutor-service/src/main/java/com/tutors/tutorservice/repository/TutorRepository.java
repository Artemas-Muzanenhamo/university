package com.tutors.tutorservice.repository;

import com.tutors.tutorservice.domain.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface TutorRepository extends JpaRepository<Tutor, String> {
    List<Tutor> findTutorsByNameIgnoreCaseContains(@Param("name") String name);

    List<Tutor> findTutorsByNameIgnoreCaseContainingAndSurnameIgnoreCaseContaining(@Param("name") String name, @Param("surname") String surname);

    List<Tutor> findTutorsByDegreesIgnoreCaseIn(@Param("degree") List<String> degree);

    Tutor findFirstByNameIgnoreCaseContaining(@Param("name") String name);

    @Override
    @RestResource(exported = false)
    void delete(Tutor entity);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
