package com.rodrigomf.apienderecos.model;

import jakarta.persistence.Column;

import java.util.Date;

public class TrilhaAuditoria {

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
}
