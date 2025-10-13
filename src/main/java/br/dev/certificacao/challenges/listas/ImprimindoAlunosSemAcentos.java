package br.dev.certificacao.challenges.listas;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import br.dev.certificacao.challenges.listas.dominio.Aluno;

public class ImprimindoAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        System.out.println(alunos.size());
        boolean adicionado = alunos.add("Paulo");
        System.out.println("Paulo foi adicionado ao Set?" + adicionado);
        System.out.println(alunos.size());

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }


         Set<String> alunosSincronizados = Collections.synchronizedSet(alunos);
         System.out.println(alunosSincronizados);
        

    }

}
