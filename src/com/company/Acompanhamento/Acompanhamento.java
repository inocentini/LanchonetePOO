package com.company.Acompanhamento;

import com.company.Pao.Pao;


public abstract class Acompanhamento extends Pao {

    protected Pao lanche;

    public Acompanhamento(Pao lanche){
        this.lanche = lanche;
    }

    protected Acompanhamento() {

    }
}
