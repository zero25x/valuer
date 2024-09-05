package com.example.valuer.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.valuer.model.Karta;

@Repository
public interface KartaRepository extends JpaRepository<Karta, Long> {


}
