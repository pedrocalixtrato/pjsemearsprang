package com.projeto.semear.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.projeto.semear.model.Aluno;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@JsonInclude
public class AlunosDTO {

    private String nome;
    private String numeroMatricula;
    private String turno;
    private String turma;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataMatricula;

    public AlunosDTO(List<Aluno> alunos) {

        for (Aluno aluno: alunos){
            if(aluno.getPessoaFisica() != null){
                this.nome = aluno.getPessoaFisica().getNome();
            }
            this.numeroMatricula = aluno.getNmatricula();
            this.turno = aluno.getTurno();
            this.turma = aluno.getTurma();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
