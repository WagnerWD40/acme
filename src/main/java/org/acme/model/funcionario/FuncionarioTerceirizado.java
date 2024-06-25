package org.acme.model.funcionario;

import org.acme.enums.Setor;
import org.acme.model.Endereco;
import org.acme.model.Telefone;
import org.acme.model.cargo.Cargo;

import java.math.BigDecimal;
import java.util.List;

public class FuncionarioTerceirizado extends FuncionarioAbst {
    private String empresaContratada;
    private Integer mesesPrevistoPermanencia;

    public FuncionarioTerceirizado(String nome, List<Telefone> telefones, Endereco endereco, Cargo cargo, Setor setor, String empresaContratada, Integer mesesPrevistoPermanencia) {
        super(nome, telefones, endereco, cargo, setor);
        this.empresaContratada = empresaContratada;
        this.mesesPrevistoPermanencia = mesesPrevistoPermanencia;
    }

    @Override
    public String toString() {
        return "FuncionarioTerceirizado{" +
                "empresaContratada='" + empresaContratada + '\'' +
                ", mesesPrevistoPermanencia=" + mesesPrevistoPermanencia +
                ", nome='" + nome + '\'' +
                ", telefones=" + telefones +
                ", salario=" + salario +
                ", endereco=" + endereco +
                ", cargo=" + cargo +
                ", setor=" + setor +
                '}';
    }
}
