package com.rodrigomf.apienderecos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="tb_continente")
public class Continente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="sgl", length = 3, nullable=false)
    private String sgl;

    @Column(name="nome", length = 200, nullable=false)
    private String nome;

    @Column(name="usu_inclusao", length = 45, nullable=false)
    private String usuInclusao;

    @Column(name="usu_alteracao", length = 45, nullable=true)
    private Date usuAlteracao;

    public void setId(int id) {
        this.id = id;
    }

    public void setSgl(String sgl) {
        this.sgl = sgl;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUsuInclusao(String usuInclusao) {
        this.usuInclusao = usuInclusao;
    }

    public void setUsuAlteracao(Date usuAlteracao) {
        this.usuAlteracao = usuAlteracao;
    }

    public int getId() {
        return id;
    }

    public String getSgl() {
        return sgl;
    }

    public String getNome() {
        return nome;
    }

    public String getUsuInclusao() {
        return usuInclusao;
    }

    public Date getUsuAlteracao() {
        return usuAlteracao;
    }
    
    

}
