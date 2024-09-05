package com.example.valuer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.valuer.model.Klient;

@Repository
public interface KlientRepository extends JpaRepository<Klient, Long> {


}
