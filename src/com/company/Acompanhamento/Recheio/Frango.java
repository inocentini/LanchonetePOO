package com.company.Acompanhamento.Recheio;


import com.company.Pao.Pao;

public class Frango extends Carne {

    public Frango(Pao lanche) {
        super(lanche);
    }


    public String getDescricao(){
        return lanche.getDescricao() + ", Frango";
    }

    @Override
    public double preco() {
        return 5.00 + lanche.preco();
    }
}
