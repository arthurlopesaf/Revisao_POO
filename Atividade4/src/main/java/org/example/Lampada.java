package org.example;

public class Lampada {


    //RNF01
    private boolean estado;

    public Lampada() {
        this.estado = false;
    }

    //RF01
    public void ligar() {
        this.estado = true;
        System.out.println("Ligado");
    }

    //RF01
    public void desligar() {
        this.estado = false;
        System.out.println("Desligado");
    }


    //RN01
    public void consultarConsumo() {
        int consumo;

        if (this.estado) {
            consumo = 10;
        } else {
            consumo = 0;
        }

        System.out.println("O consumo atual é de: " + consumo + " W");
    }
}
