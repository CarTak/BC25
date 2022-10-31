package Escola;

import java.util.Date;

public class Materia extends Professor{
    private int idMateria;
    private String materia;

    public Materia(int idprofessor, String nome, String sobrenome, String email, Date dataNasc, int idMateria, String materia) {
        super(idprofessor, nome, sobrenome, email, dataNasc);
        this.idMateria = idMateria;
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
