package com.projeto.semear.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PESSOA_TELEFONE")
public class PessoaTelefone {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TIPO")
    private Integer tipo;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "OBSERVACAO")
    private String observacao;
    @Column(name = "EMAIL")
    private String email;

    @JoinColumn(name = "ID_PESSOA_FISICA", referencedColumnName = "ID")
    @ManyToOne
    private PessoaFisica pessoaFisica;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PessoaFisica getPessoaFisica() {return pessoaFisica;}

    public void setPessoaFisica(PessoaFisica pessoaFisica) {this.pessoaFisica = pessoaFisica;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaTelefone that = (PessoaTelefone) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
