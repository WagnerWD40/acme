package org.acme.model;

import org.acme.enums.TipoTelefone;

public class Telefone {

    private final TipoTelefone tipo;
    private final Integer ddd;
    private final String numero;

    private Telefone(TipoTelefone tipo, Integer ddd, String numero) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numero = numero;
    }

    static public Telefone from(TipoTelefone tipo, Integer ddd, String numero) {
        return new Telefone(tipo, ddd, numero);
    }

    static public Telefone celular(Integer ddd, String numero) {
        return new Telefone(TipoTelefone.CELULAR, ddd, numero);
    }

    static public Telefone casa(Integer ddd, String numero) {
        return new Telefone(TipoTelefone.CASA, ddd, numero);
    }

    static public Telefone outro(Integer ddd, String numero) {
        return new Telefone(TipoTelefone.OUTRO, ddd, numero);
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "tipo=" + tipo +
                ", ddd=" + ddd +
                ", numero='" + numero + '\'' +
                '}';
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public Integer getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
