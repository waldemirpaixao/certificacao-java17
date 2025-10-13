package br.dev.certificacao.challenges.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.dev.certificacao.challenges.listas.dominio.Aula;

public class TestandoListaDeAula {

    public static void main(String[] args) {
        System.out.println("Lista da Classe Aula");
        Aula aula1 = new Aula("Revisando as ArrayLists", 21);
        Aula aula2 = new Aula("Lists de objetos", 20);
        Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

         System.out.println("");

        System.out.println("Antes da ordenação Por Título");
        System.out.println(aulas);

        System.out.println("");

        System.out.println("Depois da ordenação Por Título");
        Collections.sort(aulas);
        System.out.println(aulas);
         System.out.println("");

         System.out.println("Antes da ordenação Por Tempo");
        System.out.println(aulas);

        System.out.println("");

         System.out.println("Depois da ordenação Por Título");
        
         aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);


    }

}
