package com.company.Pao;

public class Tradicional extends Pao {



    public String getDescricao(){
        return "Lanche pão tradicional";
    }

    @Override
    public double preco() {
        return 2.50;
    }
}
