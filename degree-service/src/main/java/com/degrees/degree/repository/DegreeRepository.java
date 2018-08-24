package com.degrees.degree.repository;

import com.degrees.degree.domain.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DegreeRepository extends JpaRepository<Degree, Integer> {
}
