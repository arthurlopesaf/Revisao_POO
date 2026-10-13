package org.example;

public class Conta {

    private int numeroConta;
    private double saldo;


    public Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    //metodo saque seguindo a RN01 e RF01
    public void sacar(double valorSaque){

        if (valorSaque > 0 && valorSaque <= this.saldo){

            this.saldo = this.saldo - valorSaque;

        } else {
            System.out.println("Valor insuficiente ou incorreto");
        }
    }

    public void consultarSaldo(){

        System.out.println("Conta: " + this.numeroConta);
        System.out.println("O saldo disponivel é: " + this.saldo);
    }
}
