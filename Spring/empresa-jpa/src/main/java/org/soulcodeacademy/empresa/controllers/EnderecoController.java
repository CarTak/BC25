package org.soulcodeacademy.empresa.controllers;

import org.soulcodeacademy.empresa.domain.Endereco;
import org.soulcodeacademy.empresa.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/endereco")
    public List<Endereco> listar() { return this.enderecoService.listar(); }

}
