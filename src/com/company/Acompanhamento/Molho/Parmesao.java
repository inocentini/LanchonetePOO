package com.company.Acompanhamento.Molho;

import com.company.Pao.Pao;

public class Parmesao extends Molho {


    public Parmesao(Pao lanche) {
        super(lanche);
    }


    public String getDescricao(){
        return lanche.getDescricao() + ", Parmesao";
    }

    @Override
    public double preco() {
        return 3.50 + lanche.preco();
    }
}
