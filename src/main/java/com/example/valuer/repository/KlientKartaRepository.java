package com.example.valuer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.valuer.model.Klient;
import com.example.valuer.model.KlientKarta;

@Repository
public interface KlientKartaRepository extends JpaRepository<KlientKarta, Long> {

    List<KlientKarta> findByKlient(Klient klient);

}
