package com.company.Acompanhamento.Molho;


import com.company.Pao.Pao;

public class Azeite extends Molho {


    public Azeite(Pao lanche) {
        super(lanche);
    }


    public String getDescricao(){
        return lanche.getDescricao() + ", Azeite";
    }

    @Override
    public double preco() {
        return 1.50 + lanche.preco();
    }
}
