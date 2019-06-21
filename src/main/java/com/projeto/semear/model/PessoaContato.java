package com.projeto.semear.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PESSOA_CONTATO")
public class PessoaContato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "FONE_COMERCIAL")
    private String foneComercial;
    @Column(name = "FONE_RESIDENCIAL")
    private String foneResidencial;
    @Column(name = "FONE_CELULAR")
    private String foneCelular;

    @JoinColumn(name = "ID_PESSOA_FISICA", referencedColumnName = "ID")
    @ManyToOne
    private PessoaFisica pessoaFisica;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoneComercial() {
        return foneComercial;
    }

    public void setFoneComercial(String foneComercial) {
        this.foneComercial = foneComercial;
    }

    public String getFoneResidencial() {
        return foneResidencial;
    }

    public void setFoneResidencial(String foneResidencial) {
        this.foneResidencial = foneResidencial;
    }

    public String getFoneCelular() {
        return foneCelular;
    }

    public void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }

    public PessoaFisica getPessoaFisica() {return pessoaFisica;}

    public void setPessoaFisica(PessoaFisica pessoaFisica) {this.pessoaFisica = pessoaFisica;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaContato that = (PessoaContato) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
