package com.rodrigomf.apienderecos.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="tb_pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_continente")
    private Continente idContinente;

    @Column(name = "sgl", length = 3, nullable=false)
    private String sigla;

    @Column(name = "nome", length = 200, nullable=false)
    private String nome;

    @Column(name="usu_inclusao", length = 45, nullable=false)
    private String usuInclusao;

    @Column(name="usu_alteracao", length = 45, nullable=true)
    private String usuAlteracao;

    @Column(name="dt_hr_inclusao", nullable=false)
    private Date dtHrInclusao;

    @Column(name="dt_hr_alteracao", nullable=true)
    private Date dtHrAlteracao;


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
        Pais pais = (Pais) o;
        return Objects.equals(id, pais.id) && Objects.equals(idContinente, pais.idContinente) && Objects.equals(sigla, pais.sigla) && Objects.equals(nome, pais.nome) && Objects.equals(usuInclusao, pais.usuInclusao) && Objects.equals(usuAlteracao, pais.usuAlteracao) && Objects.equals(dtHrInclusao, pais.dtHrInclusao) && Objects.equals(dtHrAlteracao, pais.dtHrAlteracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idContinente, sigla, nome, usuInclusao, usuAlteracao, dtHrInclusao, dtHrAlteracao);
    }
}
