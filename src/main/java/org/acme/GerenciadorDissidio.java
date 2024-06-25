package org.acme;

import org.acme.model.funcionario.FuncionarioReajustavel;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDissidio {
    public Double reajusteAnual;
    public List<FuncionarioReajustavel> funcionarios = new ArrayList<>();

    public void subscribe(FuncionarioReajustavel funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void unsubscribe(FuncionarioReajustavel funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public void setReajusteAnual(Double percentual) {
        this.funcionarios.forEach(funcionario -> funcionario.reajustarSalario(percentual));
    }
}
