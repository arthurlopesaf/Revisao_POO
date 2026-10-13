package org.example;

public class MeiaEntrada extends Ingresso {

    //RN01, RF01, RNF01
    @Override
    public void calcularValor() {
        double valorDesconto = this.valor /2;

        System.out.printf("O valor do ingresso é: %.2f%n",
                valorDesconto);
    }
}
