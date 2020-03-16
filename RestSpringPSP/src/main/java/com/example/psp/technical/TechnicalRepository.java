package com.example.psp.technical;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.psp.model.Technical;

public interface TechnicalRepository extends JpaRepository<Technical, Integer> {

	
}
