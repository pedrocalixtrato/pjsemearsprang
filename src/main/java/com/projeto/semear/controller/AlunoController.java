package com.projeto.semear.controller;


import com.projeto.semear.dao.AlunoDao;
import com.projeto.semear.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {


    @Autowired
    private AlunoDao alunoDao;

    @GetMapping
    public List<Aluno> buscarTodos(){
        return alunoDao.findAll();
    }

}
