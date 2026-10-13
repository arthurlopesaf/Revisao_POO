package org.example;

public class SenhaAtendimento {

    private int senha;
    private static int contador = 0;

    //RN01, RF01, RNF01
    public SenhaAtendimento() {
        contador ++;
        this.senha = contador;
    }

    public int getSenha() {
        return senha;
    }
}
