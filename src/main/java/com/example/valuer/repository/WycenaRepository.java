package com.example.valuer.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.valuer.model.Wycena;

@Repository
public interface WycenaRepository extends JpaRepository<Wycena, Long> {


}
