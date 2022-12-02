package org.soulcodeacademy.empresa.domain.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EmpregadoDTO {
    @NotBlank(message = "Nome é obrigatório")
    protected String nome;

    @Email(message = "Email inválido")
    @NotBlank(message = "Email é obrigatório")
    protected String email;

    @NotNull(message = "Salario é obrigatório")
    protected  Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
