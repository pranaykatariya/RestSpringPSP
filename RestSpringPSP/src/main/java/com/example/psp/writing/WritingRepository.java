package com.example.psp.writing;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.psp.model.Writing;

public interface WritingRepository extends JpaRepository<Writing, Integer> {

}
