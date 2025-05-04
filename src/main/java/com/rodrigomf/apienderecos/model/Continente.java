package com.rodrigomf.apienderecos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="tb_continente")
public class Continente{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="sgl", length = 3, nullable=false)
    private String sgl;

    @Column(name="nome", length = 200, nullable=false)
    private String nome;

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

    @Column(name="usu_inclusao", length = 45, nullable=false)
    private String usuInclusao;

    @Column(name="usu_alteracao", length = 45, nullable=true)
    private String usuAlteracao;

    @Column(name="dt_hr_inclusao", nullable=false)
    private Date dtHrInclusao;

    @Column(name="dt_hr_alteracao", nullable=true)
    private Date dtHrAlteracao;

    public String getUsuInclusao() {
        return usuInclusao;
    }

    public void setUsuInclusao(String usuInclusao) {
        this.usuInclusao = usuInclusao;
    }

    public String getUsuAlteracao() {
        return usuAlteracao;
    }

    public void setUsuAlteracao(String usuAlteracao) {
        this.usuAlteracao = usuAlteracao;
    }

    public Date getDtHrInclusao() {
        return dtHrInclusao;
    }

    public void setDtHrInclusao(Date dtHrInclusao) {
        this.dtHrInclusao = dtHrInclusao;
    }

    public Date getDtHrAlteracao() {
        return dtHrAlteracao;
    }

    public void setDtHrAlteracao(Date dtHrAlteracao) {
        this.dtHrAlteracao = dtHrAlteracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continente that = (Continente) o;
        return Objects.equals(id, that.id) && Objects.equals(sgl, that.sgl) && Objects.equals(nome, that.nome) && Objects.equals(usuInclusao, that.usuInclusao) && Objects.equals(usuAlteracao, that.usuAlteracao) && Objects.equals(dtHrInclusao, that.dtHrInclusao) && Objects.equals(dtHrAlteracao, that.dtHrAlteracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sgl, nome, usuInclusao, usuAlteracao, dtHrInclusao, dtHrAlteracao);
    }
}
