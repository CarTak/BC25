package org.soulcodeacademy.Domain;

import javax.persistence.*;

@Entity
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNota;

    @Column(nullable = false)
    private Number idAluno;

    @Column(nullable = false)
    private Number idMateria;

    @Column(nullable = false)
    private Double nota;

    @Column(nullable = false)
    private Number idProfessor;

    public  Nota() {}

    public Nota(Integer idNota, Number idAluno, Number idMateria, Double nota, Number idProfessor) {
        this.idNota = idNota;
        this.idAluno = idAluno;
        this.idMateria = idMateria;
        this.nota = nota;
        this.idProfessor = idProfessor;
    }

    public Integer getIdNota() {
        return idNota;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }

    public Number getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Number idAluno) {
        this.idAluno = idAluno;
    }

    public Number getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Number idMateria) {
        this.idMateria = idMateria;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Number getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Number idProfessor) {
        this.idProfessor = idProfessor;
    }
}
