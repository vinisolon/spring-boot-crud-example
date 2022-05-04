package com.vinisolon.crudexample.services;

import com.vinisolon.crudexample.entities.Telefone;
import com.vinisolon.crudexample.repositories.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class TelefoneService {
    @Autowired
    private TelefoneRepository telefoneRepository;

    public List<Telefone> findAll() {
        return telefoneRepository.findAll();
    }

    public List<Telefone> findTelefoneByPessoaId(@PathVariable Long id) {
        return telefoneRepository.findTelefoneByPessoaId(id);
    }
}
