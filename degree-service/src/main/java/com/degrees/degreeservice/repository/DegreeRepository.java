package com.degrees.degreeservice.repository;

import com.degrees.degreeservice.domain.Degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DegreeRepository extends JpaRepository<Degree, Integer> {

    Degree findDegreeByNameIgnoreCaseContaining(@Param("degree") String degreeName);

    List<Degree> findAllByCategoryIgnoreCaseContaining(@Param("category") String category);

    List<Degree> findDegreesByHonorsIgnoreCase(@Param("honors") String honors);
}
