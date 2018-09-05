package com.company.Acompanhamento.Molho;


import com.company.Pao.Pao;

public class Mostarda extends Molho {


    public Mostarda(Pao lanche) {
        super(lanche);
    }


    public String getDescricao(){
        return lanche.getDescricao() + ", Mostarda";
    }

    @Override
    public double preco() {
        return 0.50 + lanche.preco();
    }
}
