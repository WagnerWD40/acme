package org.acme;

import org.acme.enums.Setor;
import org.acme.model.EnderecoBuilder;
import org.acme.model.Telefone;
import org.acme.model.cargo.Estagiario;
import org.acme.model.cargo.Junior;
import org.acme.model.cargo.Pleno;
import org.acme.model.cargo.Senior;
import org.acme.model.funcionario.FuncionarioAbst;
import org.acme.model.funcionario.FuncionarioBuilder;
import org.acme.model.funcionario.FuncionarioReajustavel;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        var enderecoFuncionario1 = new EnderecoBuilder().setRua("Rua Republica do Libano")
                .setNumero(345)
                .setBairro("Centro")
                .setCidade("Rio de Janeiro")
                .setEstado("RJ")
                .setCep("20061-030")
                .build();

        var funcionario1 = new FuncionarioBuilder()
                .setNome("Fulano da silva")
                .setCargo(new Estagiario())
                .setSetor(Setor.DESENVOLVIMENTO)
                .addTelefone(Telefone.celular(21, "99999-8888"))
                .addTelefone(Telefone.casa(21, "8888-8888"))
                .setEndereco(enderecoFuncionario1)
                .build();

        var enderecoFuncionario2 = new EnderecoBuilder().setRua("Rua Áurea")
                .setNumero(80)
                .setBairro("Santa Teresa")
                .setCidade("Rio de Janeiro")
                .setEstado("RJ")
                .setCep("20240-210")
                .build();

        var funcionario2 = new FuncionarioBuilder()
                .setNome("Lázaro de Jesus")
                .setCargo(new Pleno())
                .setSetor(Setor.DESENVOLVIMENTO)
                .addTelefone(Telefone.celular(21, "97777-8888"))
                .setEndereco(enderecoFuncionario2)
                .build();

        var enderecoFuncionario3 = new EnderecoBuilder().setRua("Gumercindo Bessa")
                .setComplemento("apto 201")
                .setNumero(12)
                .setBairro("Rio Comprido")
                .setCidade("Rio de Janeiro")
                .setEstado("RJ")
                .setCep("20261-230")
                .build();

        var funcionario3 = new FuncionarioBuilder()
                .setNome("Lázaro de Jesus")
                .setCargo(new Senior())
                .setSetor(Setor.DEVOPS)
                .addTelefone(Telefone.celular(21, "96666-8888"))
                .setEndereco(enderecoFuncionario3)
                .build();

        var enderecoFuncionarioTerceirizado = new EnderecoBuilder().setRua("R. Caetano de Campos")
                .setNumero(134)
                .setBairro("Tijuca")
                .setCidade("Rio de Janeiro")
                .setEstado("RJ")
                .setCep("20531-020")
                .build();

        var funcionarioTerceirizado = new FuncionarioBuilder()
                .setNome("Carlos Eduardo Leite")
                .setCargo(new Junior())
                .setSetor(Setor.BANCO_DE_DADOS)
                .addTelefone(Telefone.celular(21, "93333-8888"))
                .addTelefone(Telefone.outro(21, "92222-8888"))
                .setEndereco(enderecoFuncionarioTerceirizado)
                .setEmpresaContratada("Saiko Tech")
                .setMesesPrevistoPermanencia(6)
                .build();

        List<FuncionarioAbst> funcionarios = List.of(funcionario1, funcionario2, funcionario3, funcionarioTerceirizado);

        var gerenciadorDissidio = new GerenciadorDissidio();

        funcionarios.stream()
                    .filter(funcionario -> funcionario instanceof FuncionarioReajustavel)
                    .forEach(funcionario -> gerenciadorDissidio.subscribe((FuncionarioReajustavel) funcionario));

        gerenciadorDissidio.setReajusteAnual(10.0);

        funcionarios.forEach(System.out::println);
    }
}