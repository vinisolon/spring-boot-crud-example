package com.vinisolon.crudexample.repositories;

import com.vinisolon.crudexample.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
