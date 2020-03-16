package com.example.psp.home;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.psp.model.Home;

public interface HomeRepository extends JpaRepository<Home, Integer> {

}
