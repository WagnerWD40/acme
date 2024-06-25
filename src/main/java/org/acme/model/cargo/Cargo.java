package org.acme.model.cargo;

import org.acme.enums.TipoCargo;

import java.math.BigDecimal;

public abstract class Cargo {

    protected TipoCargo tipoCargo;
    protected BigDecimal salarioInicial;
    public BigDecimal getSalarioInicial() {
        return this.salarioInicial;
    };
    public TipoCargo getTipoCargo() {
        return  this.tipoCargo;
    };
}
