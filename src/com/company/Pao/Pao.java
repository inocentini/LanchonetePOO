package com.company.Pao;

import com.company.Acompanhamento.Acompanhamento;

public abstract class Pao  {

    public String descricao;

    public String getDescricao(){
        return descricao;
    }

    public abstract double preco();

    @Override
    public String toString() {
        return getDescricao() + " R$ " + preco();
    }
}
