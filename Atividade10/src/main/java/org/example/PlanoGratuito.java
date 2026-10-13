package org.example;

public class PlanoGratuito extends Plano {

    private double mensalidade;

    //RN01
    public PlanoGratuito() {
        this.mensalidade = 0.00;
    }

    //RF01
    @Override
    public void calcularMensalidade() {
        System.out.println("Plano gratuito: R$ " + this.mensalidade);
    }
}
