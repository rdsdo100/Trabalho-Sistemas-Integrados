package com.unialfa.sistemas.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Pessoa")
public class AlunoModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @NotNull
    String nome;
    @NotNull
    String sobrenome;
    @NotNull
    String email;
    @NotNull
    String telefone;


}
