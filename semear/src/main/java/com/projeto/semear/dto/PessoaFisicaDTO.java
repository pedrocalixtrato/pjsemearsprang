package com.projeto.semear.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.projeto.semear.model.Endereco;
import com.projeto.semear.model.PessoaFisica;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@JsonInclude
public class PessoaFisicaDTO {


    private Integer id;
    private String nome;
    private String cpf;
    private String rg;
    private String orgaoRg;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataEmissaoRg;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;
    private String sexo;
    private String naturalidade;
    private String nacionalidade;
    private String raca;
    private String tipoSangue;
    private String cnhNumero;
    private String cnhCategoria;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate cnhVencimento;
    private String tituloEleitoralNumero;
    private Integer tituloEleitoralZona;
    private Integer tituloEleitoralSecao;
    private String reservistaNumero;
    private Integer reservistaCategoria;
    private String nomeMae;
    private String nomePai;
    private List<EnderecoDTO> enderecos = new ArrayList<>();


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

    public List<EnderecoDTO> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoDTO> enderecos) {
        this.enderecos = enderecos;
    }
}
