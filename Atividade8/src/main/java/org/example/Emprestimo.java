package org.example;

public class Emprestimo{

    private Livro livro;
    private String nome;

    //RN01, RNF01
    public Emprestimo(Livro livro, String nome) {
        this.livro = livro;
        this.nome = nome;
    }

    //RF01
    public String gerarResumo(){

        return "Livro: " + livro + ", aluno: " + nome;
    }
}
