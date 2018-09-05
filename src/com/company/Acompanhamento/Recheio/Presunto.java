package com.company.Acompanhamento.Recheio;

import com.company.Pao.Pao;

public class Presunto extends Carne {

    public Presunto(Pao lanche) {
        super(lanche);
    }


    public String getDescricao(){
        return lanche.getDescricao() + ", Presunto";
    }

    @Override
    public double preco() {
        return 1.50 + lanche.preco();
    }
}
