package org.acme.model.cargo;

import org.acme.enums.TipoCargo;

import java.math.BigDecimal;

public class Senior extends Cargo {
    public Senior() {
        this.salarioInicial = new BigDecimal(11000);
        this.tipoCargo = TipoCargo.SENIOR;
    }
}
