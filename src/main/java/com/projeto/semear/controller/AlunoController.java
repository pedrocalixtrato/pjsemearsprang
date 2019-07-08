package com.projeto.semear.controller;


import com.projeto.semear.dto.AlunosDTO;
import com.projeto.semear.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {


    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunosDTO> buscarTodos(){
        return alunoService.buscarAlunos();
    }

}
