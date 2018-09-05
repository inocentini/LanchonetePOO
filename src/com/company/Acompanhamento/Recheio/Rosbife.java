package com.company.Acompanhamento.Recheio;


import com.company.Pao.Pao;

public class Rosbife extends Carne {

    public Rosbife(Pao lanche) {
        super(lanche);
    }


    public String getDescricao(){
        return lanche.getDescricao() + ", Rosbife";
    }

    @Override
    public double preco() {
        return 5.5 + lanche.preco();
    }
}
