package com.projeto.semear.dao;

import com.projeto.semear.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisicaDao extends JpaRepository<PessoaFisica, Integer> {
}
