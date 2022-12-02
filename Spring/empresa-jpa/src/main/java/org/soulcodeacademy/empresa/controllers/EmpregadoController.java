package org.soulcodeacademy.empresa.controllers;

import org.soulcodeacademy.empresa.domain.Empregado;
import org.soulcodeacademy.empresa.domain.dto.EmpregadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.soulcodeacademy.empresa.services.EmpregadoService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmpregadoController {
    @Autowired
    private EmpregadoService empregadoService;

    @GetMapping("/empregados")
    public List<Empregado> listar() { return this.empregadoService.listar(); }


    @PostMapping("/empregados")
    public Empregado salvar(@Valid @RequestBody EmpregadoDTO dto) {
       return this.empregadoService.salvar(dto);
    }
}

