package com.vinisolon.crudexample.resources;

import com.vinisolon.crudexample.entities.Telefone;
import com.vinisolon.crudexample.services.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/crud/telefone")
public class TelefoneResource {
    @Autowired
    private TelefoneService telefoneService;

    @GetMapping
    public ResponseEntity<List<Telefone>> findAll() {
        return ResponseEntity.ok().body(telefoneService.findAll());
    }

    @GetMapping(value = "/pessoa/{id}")
    public ResponseEntity<List<Telefone>> findTelefoneByPessoaId(@PathVariable Long id) {
        return ResponseEntity.ok().body(telefoneService.findTelefoneByPessoaId(id));
    }
}
