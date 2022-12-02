package org.soulcodeacademy.empresa.domain.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EnderecoDTO {
    @NotBlank(message = "Cidade é obrigatório")
    protected String cidade;

    @NotBlank(message = "UF é obrigatório")
    protected String uf;

    @NotNull(message = "Endereço é obrigatório")
    protected  Integer idEndereco;
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }
}
