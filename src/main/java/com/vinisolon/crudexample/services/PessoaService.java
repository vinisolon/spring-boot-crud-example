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
    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public Pessoa findById(@PathVariable Long id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("teste"));
    }

    // insert e update
    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void delete(@PathVariable Long id) {
        pessoaRepository.deleteById(id);
    }
}
