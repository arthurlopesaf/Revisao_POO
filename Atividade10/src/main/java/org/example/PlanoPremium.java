package org.example;

public class PlanoPremium extends Plano{

    private double mensalidade;

    //RN01
    public PlanoPremium() {
        this.mensalidade = 30.00;
    }

    //RF01
    @Override
    public void calcularMensalidade(){
        System.out.println("Plano premium: R$ " + this.mensalidade);
    }
}
