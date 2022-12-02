package org.soulcodeacademy.Services;

import org.soulcodeacademy.Domain.Aluno;
import org.soulcodeacademy.Domain.Professor;
import org.soulcodeacademy.Repositories.AlunoRepository;
import org.soulcodeacademy.Repositories.MateriaRepository;
import org.soulcodeacademy.Repositories.NotaRepository;
import org.soulcodeacademy.Repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class Escola {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private NotaRepository notaRepository;

    @Autowired
    private MateriaRepository materiaRepository;

    @PostConstruct
    public  void popularEscola(){
        Aluno aluno1 = new Aluno(null,"José", "Mauro", "jm@gmail.com", "2010-10-25");
        Aluno aluno2 = new Aluno(null,"Ricardo", "Goes", "rigo@gmail.com", "2011-01-12");
        Aluno aluno3 = new Aluno(null,"Maria", "Severina", "maria@gmail.com", "2009-06-11");
        Aluno aluno4 = new Aluno(null,"Lilian", "Cabral", "liliancabral@gmail.com", "2014-03-01");
        Aluno aluno5 = new Aluno(null,"Ricardo", "Zetta", "zetta@gmail.com", "2012-06-16");

        this.alunoRepository.saveAll(List.of(aluno1, aluno2, aluno3, aluno4, aluno5));
    }
}
