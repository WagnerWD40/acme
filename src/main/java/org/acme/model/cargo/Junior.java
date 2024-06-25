package org.acme.model.cargo;

import org.acme.enums.TipoCargo;

import java.math.BigDecimal;

public class Junior extends Cargo {
    public Junior() {
        this.salarioInicial = new BigDecimal(4000);
        this.tipoCargo = TipoCargo.JUNIOR;
    }
}
