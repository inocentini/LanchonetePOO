package com.company.Acompanhamento.Recheio;

import com.company.Acompanhamento.Acompanhamento;

import com.company.Pao.Pao;

public abstract class Carne extends Acompanhamento {

    public Carne(Pao lanche) {
        super(lanche);
    }


    protected Carne() {
    }
}
