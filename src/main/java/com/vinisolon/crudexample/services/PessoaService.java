package com.vinisolon.crudexample.services;

import com.vinisolon.crudexample.entities.Pessoa;
import com.vinisolon.crudexample.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    public Pessoa findById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new NoSuchElementException("teste"));
    }

    public Pessoa save(Pessoa pessoa) {
        return repository.save(pessoa);
    }

//    public Pessoa update(Pessoa pessoa) {
//        Pessoa pessoaToUpdate = repository.findBy(pessoa.getId());
//    }
}
