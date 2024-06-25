package org.acme.model.cargo;

import org.acme.enums.TipoCargo;

import java.math.BigDecimal;

public class Pleno extends Cargo {
    public Pleno() {
        this.salarioInicial = new BigDecimal(8000);
        this.tipoCargo = TipoCargo.PLENO;
    }
}
