package br.dev.certificacao.challenges.listas;

import java.util.ArrayList;
import java.util.Collections;

public class ChanllengeListas {

    public static void main(String[] args) {

        System.out.println("Lista de String");

        String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        for (int i = 0; i < cursos.size(); i++) {

            System.out.println(i + " - " + cursos.get(i));
        }

        for (String curso : cursos) {

            System.out.println(curso);

        }

        cursos.remove(curso1);

        Collections.sort(cursos);
        System.out.println(cursos);

        System.out.println("Fim da Lista de String");

    
    }

}
