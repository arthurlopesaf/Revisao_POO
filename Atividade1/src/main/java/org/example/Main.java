package org.example;

public class Main {

    static void main(String[] args) {

        Produto produto1 = new Produto("caderno", 100.00);

        //chamando metodo para efetuar o desconto
        produto1.calcularPrecoPromocional();

        //metodo pra retornar informacoes do objeto
        produto1.mostrarInformacoes();
    }
}