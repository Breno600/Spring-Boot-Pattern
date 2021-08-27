package com.estudo.patterns.domain.repository;

import com.estudo.patterns.domain.model.Patterns;
import com.estudo.patterns.dto.PatternDataTransferObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatternRepository extends JpaRepository<Patterns, Integer> {

    @Query(value = "SELECT * FROM PATTERN_TABLE AS ele WHERE name_pattern = ?1",nativeQuery = true)
    Optional<PatternDataTransferObject> findNamePattern(String namePattern);

    @Query(value = "SELECT * FROM PATTERN_TABLE AS ele WHERE number_patter = ?1",nativeQuery = true)
    Optional<PatternDataTransferObject> findNumberPatter(Integer numberPatter);

}
