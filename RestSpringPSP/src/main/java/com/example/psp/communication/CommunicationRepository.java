package com.example.psp.communication;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.psp.model.Communication;

public interface CommunicationRepository extends JpaRepository<Communication, Integer> {

}
