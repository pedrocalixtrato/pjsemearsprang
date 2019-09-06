package com.projeto.semear.controller;


import com.projeto.semear.dto.PessoaFisicaDTO;
import com.projeto.semear.event.RecursoCriadoEvent;
import com.projeto.semear.service.PessoaFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pessoasFisica")
public class PessoaController {


    @Autowired
    private ApplicationEventPublisher publisher;

    @Autowired
    private PessoaFisicaService pessoaFisicaService;


    @PostMapping
    public ResponseEntity<PessoaFisicaDTO> salvar(@Valid @RequestBody PessoaFisicaDTO pessoaFisicaDTO, HttpServletResponse response) {

        PessoaFisicaDTO pessoaResponse = pessoaFisicaService.cadastrarPessoaFisica(pessoaFisicaDTO);
        publisher.publishEvent(new RecursoCriadoEvent(this, response, pessoaResponse.getId()));
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaResponse);

    }

    @GetMapping
    public List<PessoaFisicaDTO> listar(){
        return pessoaFisicaService.buscarTodas();
    }

}
