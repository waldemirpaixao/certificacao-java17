package br.dev.certificacao.challenges.listas;

import java.util.Collections;
import java.util.Set;

import br.dev.certificacao.challenges.listas.dominio.Aluno;
import br.dev.certificacao.challenges.listas.dominio.Curso;
import br.dev.certificacao.challenges.listas.dominio.Aula;

public class TestaCursoComAluno {


    public static void main(String [] args){

     Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
    

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo", 34672);
        Aluno a2 = new Aluno("Guilherme", 5617);
        Aluno a3 = new Aluno("Mauricio", 17645);
        Aluno a4 = new Aluno("Jose", 12345678);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        

       // Set<Aluno> alunos = javaColecoes.getAlunos();
       // alunos.add(a4);
       
        


    }

}
