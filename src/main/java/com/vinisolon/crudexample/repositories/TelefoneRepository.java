package com.vinisolon.crudexample.repositories;

import com.vinisolon.crudexample.entities.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
