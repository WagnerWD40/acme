package org.acme.model.funcionario;

import org.acme.enums.Setor;
import org.acme.model.Endereco;
import org.acme.model.Telefone;
import org.acme.model.cargo.Cargo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FuncionarioBuilder {

    private String nome;
    private List<Telefone> telefones = new ArrayList<>();
    private Endereco endereco;
    private Cargo cargo;
    private Setor setor;
    private Optional<String> empresaContratada = Optional.empty();
    private Optional<Integer> mesesPrevistoPermanencia = Optional.empty();;

    public FuncionarioBuilder() {
    }

    public FuncionarioBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public FuncionarioBuilder addTelefone(Telefone telefone) {
        this.telefones.add(telefone);
        return this;
    }

    public FuncionarioBuilder setEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public FuncionarioBuilder setCargo(Cargo cargo) {
        this.cargo = cargo;
        return this;
    }

    public FuncionarioBuilder setSetor(Setor setor) {
        this.setor = setor;
        return this;
    }

    public FuncionarioBuilder setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = Optional.ofNullable(empresaContratada);
        return this;
    }

    public FuncionarioBuilder setMesesPrevistoPermanencia(Integer mesesPrevistoPermanencia) {
        this.mesesPrevistoPermanencia = Optional.ofNullable(mesesPrevistoPermanencia);
        return this;
    }

    public FuncionarioAbst build() {
        if (this.mesesPrevistoPermanencia.isPresent() && this.empresaContratada.isPresent()) {
            return new FuncionarioTerceirizado(nome, telefones, endereco, cargo, setor, empresaContratada.get(), mesesPrevistoPermanencia.get());
        }
        return new Funcionario(nome, telefones, endereco, cargo, setor);
    }
}
