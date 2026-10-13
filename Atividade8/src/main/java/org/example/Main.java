package org.example;

public class Main {
    static void main() {

        Livro livro1 = new Livro("Introdução à programação");
        Emprestimo emprestimo1 = new Emprestimo(livro1, "João");

        String resumo = emprestimo1.gerarResumo();

        System.out.println(resumo);

    }
}
