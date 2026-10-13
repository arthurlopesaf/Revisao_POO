package org.example;

public class Ingresso {

    protected double valor;

    public Ingresso() {
        this.valor = 20.00;
    }

    //RF01
    public void calcularValor() {
        System.out.printf("O valor do ingresso é: %.2f%n",
                this.valor);
    }

}
