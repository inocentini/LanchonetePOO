package com.company.Acompanhamento.Salada;


import com.company.Pao.Pao;

public class Agriao extends Salada {

    public Agriao(){

    }

    public Agriao(Pao lanche) {
        super(lanche);
    }

    public String getDescricao(){
        return lanche.getDescricao() + ", agriao";
    }

    @Override
    public double preco() {
        return 0.75 + lanche.preco();
    }
}
