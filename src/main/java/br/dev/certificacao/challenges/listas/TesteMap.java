package br.dev.certificacao.challenges.listas;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

    public static void main(String[] args){

        Map<Integer, String> pessoas = new HashMap<>();
        pessoas.put(21,"Leonardo Cordeiro");
        pessoas.put(27,"Fábio Pimentel");
        pessoas.put(19,"Silvio Matots");
        pessoas.put(23,"Romulo Henrique");

        pessoas.keySet().forEach(idade->{System.out.println(pessoas.get(idade));});

    }

}
