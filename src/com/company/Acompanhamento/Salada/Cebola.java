package com.company.Acompanhamento.Salada;

import com.company.Pao.Pao;

public class Cebola extends Salada {

    public Cebola(Pao lanche) {
        super(lanche);
    }


    public String getDescricao(){
        return lanche.getDescricao() + ", Cebola";
    }

    @Override
    public double preco() {
        return 1.25 + lanche.preco();
    }
}
