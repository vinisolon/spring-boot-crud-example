package com.vinisolon.crudexample.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

// Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// JPA
@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "pessoa")
    private Set<Telefone> telefones = new HashSet<>();

    public Pessoa(Long id, String nome, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
