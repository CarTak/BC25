package org.soulcodeacademy.empresa.services;

import org.soulcodeacademy.empresa.domain.Endereco;
import org.soulcodeacademy.empresa.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> listar() {
        return this.enderecoRepository.findAll();
    }

}
