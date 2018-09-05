package com.company.Acompanhamento.Salada;


import com.company.Pao.Pao;

public class Azeitona extends Salada {

    public Azeitona(Pao lanche) {
        super(lanche);
    }

    public String getDescricao(){
        return lanche.getDescricao() + ", Azeitona";
    }

    @Override
    public double preco() {
        return 1.99 + lanche.preco();
    }
}
