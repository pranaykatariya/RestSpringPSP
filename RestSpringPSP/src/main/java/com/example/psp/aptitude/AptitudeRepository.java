package com.example.psp.aptitude;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.psp.model.Aptitude;

public interface AptitudeRepository extends JpaRepository<Aptitude, Integer> {

}
