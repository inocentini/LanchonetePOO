package com.company.Acompanhamento.Salada;

import com.company.Pao.Pao;

public class Rucula extends Salada {

    public Rucula(Pao lanche) {
        super(lanche);
    }


    public String getDescricao(){
        return lanche.getDescricao() + ", Rucula";
    }

    @Override
    public double preco() {
        return 1.75 + lanche.preco();
    }
}
