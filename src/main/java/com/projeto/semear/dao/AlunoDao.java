package com.projeto.semear.dao;

import com.projeto.semear.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {
}
