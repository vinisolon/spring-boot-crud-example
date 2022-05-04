package com.vinisolon.crudexample.repositories;

import com.vinisolon.crudexample.entities.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

    List<Telefone> findTelefoneByPessoaId(Long id);
}
