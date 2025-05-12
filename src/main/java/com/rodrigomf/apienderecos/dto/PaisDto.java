package com.rodrigomf.apienderecos.dto;

import com.rodrigomf.apienderecos.model.Continente;

import java.io.Serializable;

public class PaisDto implements Serializable {

    private Long id;
    private Continente idContinente;
    private String sigla;
    private String nome;

    public PaisDto(Long id, Continente idContinente, String sigla, String nome) {
        this.id = id;
        this.idContinente = idContinente;
        this.sigla = sigla;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Continente getIdContinente() {
        return idContinente;
    }

    public void setIdContinente(Continente idContinente) {
        this.idContinente = idContinente;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
