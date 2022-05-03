package com.vinisolon.crudexample.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

// Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// JPA
@Entity
@Table(name = "telefone")
public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;

    @JoinColumn(name = "fk_pessoa_id")
    private Pessoa pessoa;
}
