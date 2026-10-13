package org.example;

public class Main {

    public void main(){

        PlanoGratuito planoGratuito1 = new PlanoGratuito();
        PlanoPremium planoPremium1 = new PlanoPremium();

        planoGratuito1.calcularMensalidade();
        planoPremium1.calcularMensalidade();
    }
}