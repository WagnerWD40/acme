package org.acme.model.funcionario;

import org.acme.enums.Setor;
import org.acme.model.Endereco;
import org.acme.model.Telefone;
import org.acme.model.cargo.Cargo;

import java.math.BigDecimal;
import java.util.List;

public class Funcionario extends  FuncionarioAbst implements FuncionarioReajustavel {


    public Funcionario(String nome, List<Telefone> telefones, Endereco endereco, Cargo cargo, Setor setor) {
        super(nome, telefones, endereco, cargo, setor);
    }

    @Override
    public void reajustarSalario(Double percentual) {
        this.salario = this.salario.add(this.salario.multiply(BigDecimal.valueOf(percentual / 100)));
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                ", salario=" + salario +
                ", endereco=" + endereco +
                ", cargo=" + cargo +
                ", setor=" + setor +
                '}';
    }
}
