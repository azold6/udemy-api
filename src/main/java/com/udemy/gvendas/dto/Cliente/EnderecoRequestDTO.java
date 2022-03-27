package com.udemy.gvendas.dto.Cliente;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Endereço requisição DTO")
public class EnderecoRequestDTO {

    @ApiModelProperty(value = "logradouro")
    private String logradouro;

    @ApiModelProperty(value = "numero")
    private Integer numero;

    @ApiModelProperty(value = "complemento")
    private String complemento;

    @ApiModelProperty(value = "bairro")
    private String bairro;

    @ApiModelProperty(value = "cep")
    private String cep;

    @ApiModelProperty(value = "cidade")
    private String cidade;

    @ApiModelProperty(value = "estado")
    private String estado;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}