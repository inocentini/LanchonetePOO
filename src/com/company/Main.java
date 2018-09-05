package com.company;

import com.company.Acompanhamento.Acompanhamento;
import com.company.Acompanhamento.Molho.Azeite;
import com.company.Acompanhamento.Molho.Molho;
import com.company.Acompanhamento.Molho.Mostarda;
import com.company.Acompanhamento.Molho.Parmesao;
import com.company.Acompanhamento.Recheio.*;
import com.company.Acompanhamento.Salada.*;
import com.company.Pao.Centeio;
import com.company.Pao.Integral;
import com.company.Pao.Pao;
import com.company.Pao.Tradicional;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        boolean op = true;
        Scanner scn = new Scanner(System.in);
        int ops;
        Pao lanche = null;
        Acompanhamento carne = null;
        Acompanhamento molho1 = null;
        Acompanhamento molho2 = null;
        Acompanhamento salada1 = null;
        Acompanhamento salada2 = null;
        Acompanhamento salada3 = null;

        while(op){
            System.out.println("---------------------KI LANCHAO---------------------");
            System.out.println("Selecione o Pão que deseja no Lanche:\n1-Tradicional\n2-Integral\n3-Centeio");
            ops = scn.nextInt();
            switch (ops){
                case 1:
                    lanche = new Tradicional();
                    break;
                case 2:
                    lanche = new Integral();
                    break;
                case 3:
                    lanche = new Centeio();
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
            System.out.println("Escolha um tipo de carne?\n1-Frango.\n2-Peixe.\n3-Presunto.\n4-Peru.\n5-Rosbife");
            ops = scn.nextInt();
            switch (ops){
                case 1:
                    carne = new Frango(lanche);
                    break;
                case 2:
                    carne = new Peixe(lanche);
                    break;
                case 3:
                    carne = new Presunto(lanche);
                    break;
                case 4:
                    carne = new Peru(lanche);
                    break;
                case 5:
                    carne = new Rosbife(lanche);
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
            boolean opm = true;
            int im =0;
            while(im<2 && opm ){
                System.out.println("Informe ate 2 tipos de molhos:\n1-Mostarda\n2-Azeite\n3-Parmesao");
                ops = scn.nextInt();
                switch (ops){
                    case 1:
                        if(im==0){
                            molho1 = new Mostarda(carne);
                        }else
                            molho2 = new Mostarda(molho1);
                        im++;
                        break;
                    case 2:
                        if(im==0){
                            molho1 = new Azeite(carne);
                        }else
                            molho2 = new Azeite(molho1);
                        im++;
                        break;
                    case 3:
                        if(im==0){
                            molho1 = new Parmesao(carne);
                        }else
                            molho2 = new Parmesao(molho1);
                        im++;
                        break;
                    default:
                        System.out.println("opcao invalida");
                        break;
                }
                if(im<2) {
                    System.out.println("Deseja adicionar mais molho?\n S: true\nN: false");
                    opm = scn.nextBoolean();
                }
            }
            boolean opcs = true;
            int is = 0;
            while(is<3 && opcs) {
                System.out.println("Informe ate 3 tipos de saladas:\n1-Alface.\n2-Tomate.\n3-Rúcula.\n4-Agrião.\n5-Cebola.\n6-Azeitona");
                ops = scn.nextInt();
                switch (ops) {
                    case 1:
                        if(is==0) {
                            if(im==2)
                                salada1 = new Alface(molho2);
                            else
                                salada1 = new Alface(molho1);
                        }else if(is==1){
                            salada2 = new Alface(salada1);
                        }else{
                            salada3 = new Alface(salada2);
                        }
                        is++;
                        break;
                    case 2:
                        if(is==0) {
                            if(im==2)
                                salada1 = new Tomate(molho2);
                            else
                                salada1 = new Tomate(molho1);
                        }else if(is==1){
                            salada2 = new Tomate(salada1);
                        }else{
                            salada3 = new Tomate(salada2);
                        }
                        is++;
                        break;
                    case 3:
                        if(is==0) {
                            if(im==2)
                                salada1 = new Rucula(molho2);
                            else
                                salada1 = new Rucula(molho1);
                        }else if(is==1){
                            salada2 = new Rucula(salada1);
                        }else{
                            salada3 = new Rucula(salada2);
                        }
                        is++;
                        break;
                    case 4:
                        if(is==0) {
                            if(im==2)
                                salada1 = new Agriao(molho2);
                            else
                                salada1 = new Agriao(molho1);
                        }else if(is==1){
                            salada2 = new Agriao(salada1);
                        }else{
                            salada3 = new Agriao(salada2);
                        }
                        is++;
                        break;
                    case 5:
                        if(is==0) {
                            if(im==2)
                                salada1 = new Cebola(molho2);
                            else
                                salada1 = new Cebola(molho1);
                        }else if(is==1){
                            salada2 = new Cebola(salada1);
                        }else{
                            salada3 = new Cebola(salada2);
                        }
                        is++;
                        break;
                    case 6:
                        if(is==0) {
                            if(im==2)
                                salada1 = new Azeitona(molho2);
                            else
                                salada1 = new Azeitona(molho1);
                        }else if(is==1){
                            salada2 = new Azeitona(salada1);
                        }else{
                            salada3 = new Azeitona(salada2);
                        }
                        is++;
                        break;
                    default:
                        System.out.println("opcao invalida");
                        break;
                }
                if(is<3) {
                    System.out.println("Deseja adicionar mais uma salada?\nSim: true\nNao:false");
                    opcs = scn.nextBoolean();
                }
            }
            if(salada3 != null)
                System.out.println(salada3);
            else if(salada2 != null)
                System.out.println(salada2);
            else
                System.out.println(salada1);

            System.out.println("Deseja realizar outro pedido?\nSim:true\nNao: false");
            op = scn.nextBoolean();
        }


    }
    
}
