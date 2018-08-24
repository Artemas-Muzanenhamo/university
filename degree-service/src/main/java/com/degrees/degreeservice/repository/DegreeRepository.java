package com.degrees.degreeservice.repository;

import com.degrees.degreeservice.domain.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DegreeRepository extends JpaRepository<Degree, Integer>{
}
