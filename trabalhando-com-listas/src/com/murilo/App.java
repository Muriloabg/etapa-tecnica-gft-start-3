package com.murilo;

import com.murilo.models.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class App {
    static int mIdade = 0;
    static Pessoa mPessoa;

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 15);
        Pessoa p2 = new Pessoa("Leandro", 21);
        Pessoa p3 = new Pessoa("Paulo", 17);
        Pessoa p4 = new Pessoa("Jessica", 18);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);

        for(Pessoa pessoa : pessoas){
            if(pessoa.getIdade() > mIdade){
                mIdade = pessoa.getIdade();
                mPessoa = pessoa;
            }
        }

        System.out.println( "Pessoa mais velha: " + mPessoa.getNome());
        mPessoa = null;

        System.out.println("\n\nLista: ");

        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.getNome());
        }


        System.out.println("\n\n");

        for(Pessoa pessoa : pessoas){
            if(pessoa.getIdade() < 18){
                pessoas.remove(pessoa);
            }
        }

        System.out.println("\n\n");

        System.out.println( "Número ainda na lista: " + pessoas.size());

        System.out.println("\n\nLista: ");

        if(pessoas.contains(p4)){
            System.out.println("Jessica está na lista");
        }
        else {
            System.out.println("Jessica não está na lista");
        }




    }




}
