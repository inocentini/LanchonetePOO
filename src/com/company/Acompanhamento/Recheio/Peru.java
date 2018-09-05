package com.company.Acompanhamento.Recheio;


import com.company.Pao.Pao;

public class Peru extends Carne {

    public Peru(Pao lanche) {
        super(lanche);
    }


    public String getDescricao(){
        return lanche.getDescricao() + ", Peru";
    }

    @Override
    public double preco() {
        return 4.50 + lanche.preco();
    }
}
