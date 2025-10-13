package br.dev.certificacao.challenges.listas;

import java.util.List;

import br.dev.certificacao.challenges.listas.dominio.Aula;
import br.dev.certificacao.challenges.listas.dominio.Curso;

public class TestaCurso {

    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
        System.out.println(javaColecoes.getAulas());

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
        System.out.println(javaColecoes.getAulas());

    }

}
