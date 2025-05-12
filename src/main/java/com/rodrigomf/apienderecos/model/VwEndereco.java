package com.rodrigomf.apienderecos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "vw_endereco")
public class VwEndereco {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "id_bairro")
    private Long idBairro;

    @Column(name = "id_cidade")
    private Long idCidade;

    @Column(name = "id_estado")
    private Long idEstado;

    @Column(name = "id_pais")
    private Long idPais;

    @Column(name = "id_continente")
    private Long idContinente;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "bairro_inicial")
    private String bairroInicial;

    @Column(name = "bairro_final")
    private String bairroFinal;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "sgl_estado")
    private String sglEstado;

    @Column(name = "cep")
    private Long cep;

    @Column(name = "nome_estado")
    private String nomeEstado;

    @Column(name = "nome_pais")
    private String nomePais;

    @Column(name = "nome_continente")
    private String nomeContinente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(Long idBairro) {
        this.idBairro = idBairro;
    }

    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public Long getIdPais() {
        return idPais;
    }

    public void setIdPais(Long idPais) {
        this.idPais = idPais;
    }

    public Long getIdContinente() {
        return idContinente;
    }

    public void setIdContinente(Long idContinente) {
        this.idContinente = idContinente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairroInicial() {
        return bairroInicial;
    }

    public void setBairroInicial(String bairroInicial) {
        this.bairroInicial = bairroInicial;
    }

    public String getBairroFinal() {
        return bairroFinal;
    }

    public void setBairroFinal(String bairroFinal) {
        this.bairroFinal = bairroFinal;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSglEstado() {
        return sglEstado;
    }

    public void setSglEstado(String sglEstado) {
        this.sglEstado = sglEstado;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getNomeContinente() {
        return nomeContinente;
    }

    public void setNomeContinente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VwEndereco that = (VwEndereco) o;
        return Objects.equals(id, that.id) && Objects.equals(idBairro, that.idBairro) && Objects.equals(idCidade, that.idCidade) && Objects.equals(idEstado, that.idEstado) && Objects.equals(idPais, that.idPais) && Objects.equals(idContinente, that.idContinente) && Objects.equals(tipo, that.tipo) && Objects.equals(logradouro, that.logradouro) && Objects.equals(complemento, that.complemento) && Objects.equals(bairroInicial, that.bairroInicial) && Objects.equals(bairroFinal, that.bairroFinal) && Objects.equals(cidade, that.cidade) && Objects.equals(sglEstado, that.sglEstado) && Objects.equals(cep, that.cep) && Objects.equals(nomeEstado, that.nomeEstado) && Objects.equals(nomePais, that.nomePais) && Objects.equals(nomeContinente, that.nomeContinente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idBairro, idCidade, idEstado, idPais, idContinente, tipo, logradouro, complemento, bairroInicial, bairroFinal, cidade, sglEstado, cep, nomeEstado, nomePais, nomeContinente);
    }
}
