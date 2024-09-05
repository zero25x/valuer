package com.example.valuer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.valuer.model.Komentarz;

@Repository
public interface KomentarzRepository extends JpaRepository<Komentarz, Long> {


}
