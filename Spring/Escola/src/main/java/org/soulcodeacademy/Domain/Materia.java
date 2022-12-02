package org.soulcodeacademy.Domain;

import javax.persistence.*;

@Entity
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMateria;

    @Column(nullable = false)
    private Number idProfessor;

    @Column(nullable = false, length = 120)
    private String Materia;

    public  Materia() {}

    public Materia(Integer idMateria, Number idProfessor, String materia) {
        this.idMateria = idMateria;
        this.idProfessor = idProfessor;
        Materia = materia;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Number getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Number idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }
}
