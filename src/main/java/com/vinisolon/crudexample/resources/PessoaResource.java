package com.vinisolon.crudexample.resources;

import com.vinisolon.crudexample.entities.Pessoa;
import com.vinisolon.crudexample.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "api/crud/pessoa")
public class PessoaResource {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll() {
        List<Pessoa> pessoaList = pessoaService.findAll();
        return ResponseEntity.ok().body(pessoaList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pessoa> findById(@PathVariable Long id) {
        Pessoa pessoa = pessoaService.findById(id);
        return ResponseEntity.ok().body(pessoa);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Pessoa> create(@RequestBody Pessoa pessoa) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pessoa.getId()).toUri();
        return ResponseEntity.created(uri).body(pessoaService.save(pessoa));
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Pessoa> update(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok().body(pessoaService.save(pessoa));
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        pessoaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
