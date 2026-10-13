package org.example;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Conta conta1 = new Conta(1346, 100.00);

        double valorSaque;
        int opcao = -1;

        while (opcao != 0) {

            System.out.println("======= CAIXA ELETRONICO =======");
            System.out.println("Opcao 0 = Sair");
            System.out.println("Opcao 1 = Saque");
            System.out.println("Opcao 2 = Ver saldo");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Qual valor deseja sacar?");
                    valorSaque = scanner.nextDouble();

                    conta1.sacar(valorSaque);
                    conta1.consultarSaldo();

                    break;

                case 2:

                    conta1.consultarSaldo();

                    break;

                default:
                    System.out.println("opcao invalida");

                    break;
            }
        }
    }
}