package com.projeto.semear.dao.endereco;

import com.projeto.semear.model.Endereco;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EnderecoDaoQuery {
    public Page<Endereco> buscarTodos(Pageable pageable);
}
