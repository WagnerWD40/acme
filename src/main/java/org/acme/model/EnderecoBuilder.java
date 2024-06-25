package org.acme.model;

import java.util.Optional;

public class EnderecoBuilder {
    private String rua;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public EnderecoBuilder setRua(String rua) {
        this.rua = rua;
        return this;
    }

    public EnderecoBuilder setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }

    public EnderecoBuilder setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public EnderecoBuilder setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public EnderecoBuilder setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public EnderecoBuilder setEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public EnderecoBuilder setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public Endereco build() {
        return Endereco.from(rua, numero, complemento, bairro, cidade, estado, cep);
    }
}
