package org.example;

public class Produto {
    private String nome;
    private double precoUnit;

    public Produto(String nome, double precoUnit) {
        this.nome = nome;
        this.precoUnit = precoUnit;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }
}
