package org.soulcodeacademy.empresa.services;

import org.soulcodeacademy.empresa.domain.Empregado;
import org.soulcodeacademy.empresa.domain.dto.EmpregadoDTO;
import org.soulcodeacademy.empresa.repositories.EmpregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpregadoService {
    @Autowired
    private EmpregadoRepository empregadoRepository;

    public List<Empregado> listar() {
        return this.empregadoRepository.findAll();
    }

    public Empregado salvar(EmpregadoDTO dto) {
        Empregado novoEmpregado = new Empregado(null, dto.getNome(), dto.getEmail(), dto.getSalario());
        return this.empregadoRepository.save(novoEmpregado);
    }
}
