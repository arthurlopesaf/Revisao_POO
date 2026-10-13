package org.example;

public class Livro {

    private String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}
