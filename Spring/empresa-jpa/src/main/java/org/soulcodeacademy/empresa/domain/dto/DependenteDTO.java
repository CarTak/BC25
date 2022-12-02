package org.soulcodeacademy.empresa.domain.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class DependenteDTO {
    @NotBlank(message = "Nome é obrigatório")
    protected String nome;

    @NotNull(message = "idade é obrigatório")
    protected  Number idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Number getIdade() {
        return idade;
    }

    public void setIdade(Number idade) {
        this.idade = idade;
    }
}
