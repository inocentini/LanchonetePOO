package com.company.Acompanhamento.Recheio;

import com.company.Pao.Pao;

public class Peixe extends Carne {

    public Peixe(Pao lanche) {
        super(lanche);
    }


    public String getDescricao(){
        return lanche.getDescricao() + ", Peixe";
    }

    @Override
    public double preco() {
        return 7.50 + lanche.preco();
    }
}
