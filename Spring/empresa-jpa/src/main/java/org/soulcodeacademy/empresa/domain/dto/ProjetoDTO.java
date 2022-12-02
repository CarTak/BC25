package org.soulcodeacademy.empresa.domain.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProjetoDTO {
    @NotBlank(message = "Descricao é obrigatório")
    protected String descricao;

    @NotBlank(message = "Nome é obrigatório")
    protected String nome;

    @NotNull(message = "Orçamento é obrigatório")
    protected  Double orcamento;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }
}
