package org.acme.model.funcionario;

import org.acme.enums.Setor;
import org.acme.model.Endereco;
import org.acme.model.Telefone;
import org.acme.model.cargo.Cargo;

import java.math.BigDecimal;
import java.util.List;

abstract public class FuncionarioAbst {
    protected String nome;
    protected List<Telefone> telefones;
    protected BigDecimal salario;
    protected Endereco endereco;
    protected Cargo cargo;
    protected Setor setor;

    public FuncionarioAbst(String nome, List<Telefone> telefones, Endereco endereco, Cargo cargo, Setor setor) {
        this.nome = nome;
        this.telefones = telefones;
        this.salario = cargo.getSalarioInicial();
        this.endereco = endereco;
        this.cargo = cargo;
        this.setor = setor;
    }
}
