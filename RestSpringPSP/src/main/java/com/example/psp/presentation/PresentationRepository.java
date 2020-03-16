package com.example.psp.presentation;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.psp.model.Presentation;

public interface PresentationRepository extends JpaRepository<Presentation, Integer> {

}
