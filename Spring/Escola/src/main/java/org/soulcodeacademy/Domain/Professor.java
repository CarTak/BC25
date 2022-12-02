package org.soulcodeacademy.Domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPreofessor;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, length = 120)
    private String sobrenome;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(nullable = false)
    private Date dataNascimento;

    public  Professor() {}

    public Professor(Integer idPreofessor, String nome, String sobrenome, String email, Date dataNascimento) {
        this.idPreofessor = idPreofessor;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdPreofessor() {
        return idPreofessor;
    }

    public void setIdPreofessor(Integer idPreofessor) {
        this.idPreofessor = idPreofessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
