package com.projeto.semear.dao;

import com.projeto.semear.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioDao extends JpaRepository<Usuario, Integer> {

    public Optional<Usuario> findByEmail(String email);
}
