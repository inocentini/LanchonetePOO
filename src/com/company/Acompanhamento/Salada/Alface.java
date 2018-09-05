package com.company.Acompanhamento.Salada;


import com.company.Pao.Pao;

public class Alface extends Salada {

    public Alface(Pao lanche) {
        super(lanche);
    }


    public String getDescricao(){
        return lanche.getDescricao() + ", Alface";
    }

    @Override
    public double preco() {
        return 1.20 + lanche.preco();
    }
}
