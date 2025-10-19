package br.dev.certificacao.challenges.oop.bytebank;

public class CriaConta {


    public static void main(String args[]){

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);


        Conta segundaConta = primeiraConta;
        segundaConta = primeiraConta;
        segundaConta.saldo += 50;
        System.out.println(primeiraConta);
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);




    }
}
