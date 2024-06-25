package org.acme.model.cargo;

import org.acme.enums.TipoCargo;

import java.math.BigDecimal;

public class Estagiario extends Cargo {

    public Estagiario() {
        this.salarioInicial = new BigDecimal(2000);
        this.tipoCargo = TipoCargo.ESTAGIARIO;
    }
}
