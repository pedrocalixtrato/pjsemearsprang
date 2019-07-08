package com.projeto.semear.service.impl;

import com.projeto.semear.dao.AlunoDao;
import com.projeto.semear.dto.AlunosDTO;
import com.projeto.semear.model.Aluno;
import com.projeto.semear.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoDao alunoDao;

    @Override
    public List<AlunosDTO> buscarAlunos() {
        List<Aluno> alunos = alunoDao.findAll();
        List<AlunosDTO> alunosDTO = alunos
                .stream()
                .map(aluno -> new AlunosDTO(alunos))
                .collect(Collectors.toList());


        return alunosDTO;
    }
}
