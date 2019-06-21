package com.projeto.semear.dao;

import com.projeto.semear.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoDao extends JpaRepository <Endereco, Long> {
}
