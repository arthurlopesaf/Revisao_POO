package org.example;

public class Produto {

    private String nome;
    private double preco;
    private double valorDesconto;

    //construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //criacao do metodo para aplicar o desconto
    public void calcularPrecoPromocional(){

        double desconto = 0.90;

        valorDesconto = this.preco * desconto;

    }

    //metodo para imprimir as informacoes do objeto
    public void mostrarInformacoes(){
        System.out.println(this.nome);
        System.out.println("O valor sem desconto é: " + this.preco);
        System.out.println("O valor com desconto é: " + this.valorDesconto);
    }
}
