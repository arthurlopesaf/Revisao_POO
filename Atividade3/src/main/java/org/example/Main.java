package org.example;

public class Main{

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("joao", 8, 6);
        Aluno aluno2 = new Aluno("Maria", 5, 7);

        aluno1.estaAprovado();
        aluno2.estaAprovado();

    }
}