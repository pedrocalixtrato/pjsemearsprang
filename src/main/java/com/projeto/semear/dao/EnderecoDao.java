package com.projeto.semear.dao;

import com.projeto.semear.dao.endereco.EnderecoDaoQuery;
import com.projeto.semear.model.Endereco;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoDao extends JpaRepository <Endereco, Integer>, EnderecoDaoQuery {

    Page<Endereco> buscarTodos(Pageable pageable);

}
