package com.company.Acompanhamento.Salada;


import com.company.Pao.Pao;

public class Tomate extends Salada {

    public Tomate(Pao lanche) {
        super(lanche);
    }


    public String getDescricao(){
        return lanche.getDescricao() + ", Tomate";
    }

    @Override
    public double preco() {
        return 2.00 + lanche.preco();
    }
}
