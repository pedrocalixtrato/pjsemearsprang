package com.projeto.semear.controller;

import com.projeto.semear.dao.EnderecoDao;
import com.projeto.semear.event.RecursoCriadoEvent;
import com.projeto.semear.model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping ("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoDao enderecoDao;

    @Autowired
    private ApplicationEventPublisher publisher;

    @PostMapping
    public ResponseEntity<Endereco> novoEndereco (@Valid @RequestBody Endereco endereco, HttpServletResponse response) {

        Endereco enderecoSalvo = enderecoDao.save(endereco);
        publisher.publishEvent(new RecursoCriadoEvent(this, response, enderecoSalvo.getId()));
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> buscarPorId (@PathVariable Long id) {
        Endereco endereco = enderecoDao.findById(id).orElse(null);
        return endereco != null ? ResponseEntity.ok(endereco) : ResponseEntity.notFound().build();
    }



    @GetMapping
    public List<Endereco> buscarTodos() {
        return enderecoDao.findAll();
    }
}
