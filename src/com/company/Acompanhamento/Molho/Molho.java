package com.company.Acompanhamento.Molho;

import com.company.Acompanhamento.Acompanhamento;
import com.company.Pao.Pao;


public abstract class Molho extends Acompanhamento {
    public Molho(Pao lanche) {
        super(lanche);
    }

    protected Molho() {
    }
}
