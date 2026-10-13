package org.example;

public class Aluno {

    private String aluno;
    private int nota1;
    private int nota2;


    public Aluno(String aluno, int nota1, int nota2) {
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //metodo para a RN01
    public double calcularMedia(){
        double media = 0;

        media = (this.nota1 + this.nota2) /2.0;

        return media;
    }

    //metodo conforme a RNF01
    public void estaAprovado(){

        double media = calcularMedia();

        if (media >= 7){
            System.out.println("A media do(a) " + this.aluno + " é: " + media);
            System.out.println("Situacao: aprovado");
        } else {
            System.out.println("A media do(a) " + this.aluno + " é: " + media);
            System.out.println("Situacao: reprovado");
        }
    }
}
