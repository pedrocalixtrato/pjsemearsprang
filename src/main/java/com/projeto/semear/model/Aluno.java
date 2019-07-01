package com.projeto.semear.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DATA_MATRICULA")
    private LocalDate dataMatricula;
    @Column(name = "N_MATRICULA")
    private String nmatricula;
    @Column(name = "GRUPO")
    private String grupo;
    @Column(name = "TURNO")
    private String turno;
    @Column(name = "LOCAL_TRAB_PAI")
    private String local_trab_pai;
    @Column(name = "LOCAL_TRAB_MAE")
    private String local_trab_mae;

    @Column(name = "CASA_PROPRIA")
    private String casa_propria;
    @Column(name = "QTO_FAMILIA")
    private String qto_familia;
    @Column(name = "QTO_FAMILIA_MAIORES")
    private String qto_familia_maiores;
    @Column(name = "QTO_FAMILIA_MENORES")
    private String qto_familia_menores;
    @Column(name = "PAI_SEPARADOS")
    private String pai_separado;
    @Column(name = "DIA_VISITA")
    private String dia_visita;
    @Column(name = "NOME_ESCOLA")
    private String nome_escola;
    @Column(name = "ANO_CURSANDO")
    private String ano_cursando;
    @Column(name = "TURMA")
    private String turma;
    @Column(name = "TURNO_2")
    private String turno_2;
    @Column(name = "BENEFICIO")
    private String beneficio;
    @Column(name = "NIS")
    private String nis;
    @Column(name = "NIS_ALUNO")
    private String nis_aluno;
    @Column(name = "SAUDE_ESF")
    private String saude_esf;
    @Column(name = "CRAS_REF")
    private String cras_ref;
    @Column(name = "CURSO_PRETENDIDO")
    private String curso_pretendido;
    @Column(name = "OBS_FILIACAO")
    private String obs_filiacao;


    @Column(name = "MEDICACAO")
    private String medicacao;
    @Column(name = "ALERGIA")
    private String alergia;
    @Column(name = "COMPORTAMENTO_CASA")
    private String comportamento_casa;
    @Column(name = "COMPORTAMENTO_ESCOLA")
    private String comportamento_escola;
    @Column(name = "MEDIA_ESCOLAR")
    private String media_escolar;
    @Column(name = "PRIORITARIO")
    private String prioritario;



    @JoinColumn(name = "ID_PESSOA_FISICA", referencedColumnName = "ID")
    @ManyToOne
    private PessoaFisica pessoaFisica;
    @JoinColumn(name = "ID_PESSOA_FISICA_MAE", referencedColumnName = "ID")
    @ManyToOne
    private PessoaFisica maeAluno;
    @JoinColumn(name = "ID_PESSOA_FISICA_PAI", referencedColumnName = "ID")
    @ManyToOne
    private PessoaFisica paiAluno;


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

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNmatricula() {
        return nmatricula;
    }

    public void setNmatricula(String nmatricula) {
        this.nmatricula = nmatricula;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getLocal_trab_pai() {
        return local_trab_pai;
    }

    public void setLocal_trab_pai(String local_trab_pai) {
        this.local_trab_pai = local_trab_pai;
    }

    public String getLocal_trab_mae() {
        return local_trab_mae;
    }

    public void setLocal_trab_mae(String local_trab_mae) {
        this.local_trab_mae = local_trab_mae;
    }

    public String getCasa_propria() {
        return casa_propria;
    }

    public void setCasa_propria(String casa_propria) {
        this.casa_propria = casa_propria;
    }

    public String getQto_familia() {
        return qto_familia;
    }

    public void setQto_familia(String qto_familia) {
        this.qto_familia = qto_familia;
    }

    public String getQto_familia_maiores() {
        return qto_familia_maiores;
    }

    public void setQto_familia_maiores(String qto_familia_maiores) {
        this.qto_familia_maiores = qto_familia_maiores;
    }

    public String getQto_familia_menores() {
        return qto_familia_menores;
    }

    public void setQto_familia_menores(String qto_familia_menores) {
        this.qto_familia_menores = qto_familia_menores;
    }

    public String getPai_separado() {
        return pai_separado;
    }

    public void setPai_separado(String pai_separado) {
        this.pai_separado = pai_separado;
    }

    public String getDia_visita() {
        return dia_visita;
    }

    public void setDia_visita(String dia_visita) {
        this.dia_visita = dia_visita;
    }

    public String getNome_escola() {
        return nome_escola;
    }

    public void setNome_escola(String nome_escola) {
        this.nome_escola = nome_escola;
    }

    public String getAno_cursando() {
        return ano_cursando;
    }

    public void setAno_cursando(String ano_cursando) {
        this.ano_cursando = ano_cursando;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurno_2() {
        return turno_2;
    }

    public void setTurno_2(String turno_2) {
        this.turno_2 = turno_2;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNis_aluno() {
        return nis_aluno;
    }

    public void setNis_aluno(String nis_aluno) {
        this.nis_aluno = nis_aluno;
    }

    public String getSaude_esf() {
        return saude_esf;
    }

    public void setSaude_esf(String saude_esf) {
        this.saude_esf = saude_esf;
    }

    public String getCras_ref() {
        return cras_ref;
    }

    public void setCras_ref(String cras_ref) {
        this.cras_ref = cras_ref;
    }

    public String getCurso_pretendido() {
        return curso_pretendido;
    }

    public void setCurso_pretendido(String curso_pretendido) {
        this.curso_pretendido = curso_pretendido;
    }

    public String getObs_filiacao() {
        return obs_filiacao;
    }

    public void setObs_filiacao(String obs_filiacao) {
        this.obs_filiacao = obs_filiacao;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getComportamento_casa() {
        return comportamento_casa;
    }

    public void setComportamento_casa(String comportamento_casa) {
        this.comportamento_casa = comportamento_casa;
    }

    public String getComportamento_escola() {
        return comportamento_escola;
    }

    public void setComportamento_escola(String comportamento_escola) {
        this.comportamento_escola = comportamento_escola;
    }

    public String getMedia_escolar() {
        return media_escolar;
    }

    public void setMedia_escolar(String media_escolar) {
        this.media_escolar = media_escolar;
    }

    public String getPrioritario() {
        return prioritario;
    }

    public void setPrioritario(String prioritario) {
        this.prioritario = prioritario;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaFisica getMaeAluno() {
        return maeAluno;
    }

    public void setMaeAluno(PessoaFisica maeAluno) {
        this.maeAluno = maeAluno;
    }

    public PessoaFisica getPaiAluno() {
        return paiAluno;
    }

    public void setPaiAluno(PessoaFisica paiAluno) {
        this.paiAluno = paiAluno;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id.equals(aluno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
