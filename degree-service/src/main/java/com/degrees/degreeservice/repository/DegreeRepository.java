package com.degrees.degreeservice.repository;

import com.degrees.degreeservice.domain.Degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface DegreeRepository extends JpaRepository<Degree, Integer> {

    Degree findDegreeByNameIgnoreCaseContaining(@Param("degree") String degreeName);

    List<Degree> findAllByCategoryIgnoreCaseContaining(@Param("category") String category);

    List<Degree> findDegreesByHonorsIgnoreCase(@Param("honors") String honors);

    @Override
    @RestResource(exported = false)
    void delete(Degree degree);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
