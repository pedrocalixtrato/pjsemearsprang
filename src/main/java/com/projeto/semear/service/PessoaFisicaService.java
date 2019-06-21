package com.projeto.semear.service;


import com.projeto.semear.dao.EnderecoDao;
import com.projeto.semear.dao.PessoaFisicaDao;
import com.projeto.semear.dto.EnderecoDTO;
import com.projeto.semear.dto.PessoaFisicaDTO;
import com.projeto.semear.model.Endereco;
import com.projeto.semear.model.PessoaFisica;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PessoaFisicaService {

    @Autowired
    private PessoaFisicaDao pessoaFisicaDao;
    @Autowired
    private EnderecoDao enderecoDao;

    public PessoaFisicaDTO cadastrarPessoaFisica (PessoaFisicaDTO pessoaFisicaDTO) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        BeanUtils.copyProperties(pessoaFisicaDTO, pessoaFisica, "id", "enderecos");
        PessoaFisica pessoaFisicaSalva = pessoaFisicaDao.save(pessoaFisica);
        if (pessoaFisicaDTO.getEnderecos() != null) {
            adcionarEndereco(pessoaFisicaDTO, pessoaFisicaSalva);
        }

        pessoaFisicaDTO.setId(pessoaFisicaSalva.getId());
        return pessoaFisicaDTO;
    }

    public PessoaFisica adcionarEndereco (PessoaFisicaDTO pessoaFisicaDTO, PessoaFisica pessoaFisicaSalva) {

        Set<Endereco> enderecos  = new HashSet<>();
        for (EnderecoDTO e: pessoaFisicaDTO.getEnderecos()){
            Endereco endereco = new Endereco();
            BeanUtils.copyProperties(e, endereco);
            endereco.setPessoaFisica(pessoaFisicaSalva);
            Endereco enderecoSalvo = enderecoDao.save(endereco);
            e.setId(enderecoSalvo.getId());
            enderecos.add(enderecoSalvo);
        }
        pessoaFisicaSalva.setListaEndereco(enderecos);

      return pessoaFisicaSalva;

    }

    public List<PessoaFisicaDTO> buscarTodas() {
        List<PessoaFisica> pessoasFisica = pessoaFisicaDao.findAll();

        return montarResposta(pessoasFisica);
    }


    private List<PessoaFisicaDTO> montarResposta(List<PessoaFisica> pessoasFisica) {
        List<PessoaFisicaDTO> listPessoaFisicaDTO = new ArrayList<>();


        for (PessoaFisica p : pessoasFisica) {
            PessoaFisicaDTO pessoaFisicaDTO = new PessoaFisicaDTO();
            BeanUtils.copyProperties(p, pessoaFisicaDTO);

            for (Endereco end : p.getListaEndereco()) {
                EnderecoDTO enderecoDTO = new EnderecoDTO();
                BeanUtils.copyProperties(end, enderecoDTO);
                pessoaFisicaDTO.getEnderecos().add(enderecoDTO);
            }
            listPessoaFisicaDTO.add(pessoaFisicaDTO);
        }
        return listPessoaFisicaDTO;
    }
}
