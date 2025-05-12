package com.rodrigomf.apienderecos.dto;

import java.io.Serializable;

public class ContinenteDto implements Serializable {

    private Long id;
    private String sgl;
    private String nome;

    public ContinenteDto(Long id, String sgl, String nome) {
        this.id = id;
        this.sgl = sgl;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSgl() {
        return sgl;
    }

    public void setSgl(String sgl) {
        this.sgl = sgl;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
