package com.projeto.semear.model;

import com.projeto.semear.model.enuns.EstadoCivil;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "PESSOA_FISICA")
public class PessoaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "RG")
    private String rg;
    @Column(name = "ORGAO_RG")
    private String orgaoRg;
    @Column(name = "DATA_EMISSAO_RG")
    private LocalDate dataEmissaoRg;
    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;
    @Column(name = "SEXO")
    private String sexo;
    @Column(name = "NATURALIDADE")
    private String naturalidade;
    @Column(name = "NACIONALIDADE")
    private String nacionalidade;
    @Column(name = "RACA")
    private String raca;
    @Column(name = "TIPO_SANGUE")
    private String tipoSangue;
    @Column(name = "CNH_NUMERO")
    private String cnhNumero;
    @Column(name = "CNH_CATEGORIA")
    private String cnhCategoria;
    @Column(name = "CNH_VENCIMENTO")
    private LocalDate cnhVencimento;
    @Column(name = "TITULO_ELEITORAL_NUMERO")
    private String tituloEleitoralNumero;
    @Column(name = "TITULO_ELEITORAL_ZONA")
    private Integer tituloEleitoralZona;
    @Column(name = "TITULO_ELEITORAL_SECAO")
    private Integer tituloEleitoralSecao;
    @Column(name = "RESERVISTA_NUMERO")
    private String reservistaNumero;
    @Column(name = "RESERVISTA_CATEGORIA")
    private Integer reservistaCategoria;
    @Column(name = "NOME_MAE")
    private String nomeMae;
    @Column(name = "NOME_PAI")
    private String nomePai;


    @Column(name = "ESTADO_CIVIL")
    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    @OneToMany(mappedBy = "pessoaFisica", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Endereco> listaEndereco;

    @OneToMany(mappedBy = "pessoaFisica", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PessoaContato> listaPessoaContato;

    @OneToMany(mappedBy = "pessoaFisica", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PessoaTelefone> listaPessoaTelefone;


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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoRg() {
        return orgaoRg;
    }

    public void setOrgaoRg(String orgaoRg) {
        this.orgaoRg = orgaoRg;
    }

    public LocalDate getDataEmissaoRg() {
        return dataEmissaoRg;
    }

    public void setDataEmissaoRg(LocalDate dataEmissaoRg) {
        this.dataEmissaoRg = dataEmissaoRg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public String getCnhNumero() {
        return cnhNumero;
    }

    public void setCnhNumero(String cnhNumero) {
        this.cnhNumero = cnhNumero;
    }

    public String getCnhCategoria() {
        return cnhCategoria;
    }

    public void setCnhCategoria(String cnhCategoria) {
        this.cnhCategoria = cnhCategoria;
    }

    public LocalDate getCnhVencimento() {
        return cnhVencimento;
    }

    public void setCnhVencimento(LocalDate cnhVencimento) {
        this.cnhVencimento = cnhVencimento;
    }

    public String getTituloEleitoralNumero() {
        return tituloEleitoralNumero;
    }

    public void setTituloEleitoralNumero(String tituloEleitoralNumero) {
        this.tituloEleitoralNumero = tituloEleitoralNumero;
    }

    public Integer getTituloEleitoralZona() {
        return tituloEleitoralZona;
    }

    public void setTituloEleitoralZona(Integer tituloEleitoralZona) {
        this.tituloEleitoralZona = tituloEleitoralZona;
    }

    public Integer getTituloEleitoralSecao() {
        return tituloEleitoralSecao;
    }

    public void setTituloEleitoralSecao(Integer tituloEleitoralSecao) {
        this.tituloEleitoralSecao = tituloEleitoralSecao;
    }

    public String getReservistaNumero() {
        return reservistaNumero;
    }

    public void setReservistaNumero(String reservistaNumero) {
        this.reservistaNumero = reservistaNumero;
    }

    public Integer getReservistaCategoria() {
        return reservistaCategoria;
    }

    public void setReservistaCategoria(Integer reservistaCategoria) {
        this.reservistaCategoria = reservistaCategoria;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Set<Endereco> getListaEndereco() {
        return listaEndereco;
    }

    public void setListaEndereco(Set<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
    }

    public Set<PessoaContato> getListaPessoaContato() {
        return listaPessoaContato;
    }

    public void setListaPessoaContato(Set<PessoaContato> listaPessoaContato) {
        this.listaPessoaContato = listaPessoaContato;
    }

    public Set<PessoaTelefone> getListaPessoaTelefone() {
        return listaPessoaTelefone;
    }

    public void setListaPessoaTelefone(Set<PessoaTelefone> listaPessoaTelefone) {
        this.listaPessoaTelefone = listaPessoaTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
