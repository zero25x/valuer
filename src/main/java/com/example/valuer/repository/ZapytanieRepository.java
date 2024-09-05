package com.example.valuer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.valuer.model.Zapytanie;

@Repository
public interface ZapytanieRepository extends JpaRepository<Zapytanie, Long> {


}
