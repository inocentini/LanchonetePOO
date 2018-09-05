package com.company.Acompanhamento.Salada;

import com.company.Acompanhamento.Acompanhamento;
import com.company.Pao.Pao;


public abstract class Salada extends Acompanhamento {
    public Salada(Pao lanche) {
        super(lanche);
    }

    protected Salada() {
    }
}
