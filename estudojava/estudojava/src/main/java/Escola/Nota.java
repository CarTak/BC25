package Escola;

import java.sql.SQLOutput;
import java.util.Date;

public class Nota extends  Materia{
    private int idNota;
    private double nota;
    private int idAluno;

    public Nota(int idprofessor, String nome, String sobrenome, String email, Date dataNasc, int idMateria, String materia, int idNota, double nota, int idAluno) {
        super(idprofessor, nome, sobrenome, email, dataNasc, idMateria, materia);
        this.idNota = idNota;
        this.nota = nota;
        this.idAluno = idAluno;
    }

    public void main(String[] args) {
        this.idAluno = Aluno.getIdAluno();
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

