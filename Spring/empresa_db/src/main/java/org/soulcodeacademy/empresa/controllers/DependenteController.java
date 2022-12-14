package org.soulcodeacademy.empresa.controllers;

import org.soulcodeacademy.empresa.domain.Dependente;
import org.soulcodeacademy.empresa.domain.Empregado;
import org.soulcodeacademy.empresa.domain.dto.DependenteDTO;
import org.soulcodeacademy.empresa.domain.dto.EmpregadoDTO;
import org.soulcodeacademy.empresa.services.DependenteService;
import org.soulcodeacademy.empresa.services.EmpregadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DependenteController {


        @Autowired
        private DependenteService dependenteService;

        @GetMapping("/dependentes")

        public List<Dependente> listarDependentes() {
            return this.dependenteService.listarDependente();
        }

        @GetMapping("/dependentes/{idDependente}")
        public Dependente getDependente(@PathVariable Integer idDependente) {
            return this.dependenteService.getDependente(idDependente);
        }


        @PostMapping("/dependentes")
        public Dependente salvar(@Valid @RequestBody DependenteDTO dto) {
            return this.dependenteService.salvar(dto);
        }

        @PutMapping("/dependentes/{idDependente}")
        public Dependente atualizar(@PathVariable Integer idDependente, @Valid @RequestBody DependenteDTO dto) {
            Dependente atualizado = this.dependenteService.atualizar(idDependente, dto);
            return atualizado;
        }

        @DeleteMapping("/dependentes/{idDependente}")
        public void deletar(@PathVariable Integer idDependente) {
            this.dependenteService.deletar(idDependente);
        }

    }

