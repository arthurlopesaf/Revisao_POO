package org.example;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 1;

        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        while (opcao != 0) {

            System.out.println("MENU LAMPADAS");
            System.out.println("1 = ligar lampada 1");
            System.out.println("2 = ligar lampada 2");
            System.out.println("3 = desligar lampada 1");
            System.out.println("4 = desligar lampada 2");
            System.out.println("5 = consultar consumo");
            System.out.println("0 = SAIR");
            opcao = scanner.nextInt();


            switch (opcao) {

                case 1:
                    lampada1.ligar();
                    break;

                case 2:
                    lampada2.ligar();
                    break;

                case 3:
                    lampada1.desligar();
                    break;

                case 4:
                    lampada2.desligar();
                    break;

                case 5:
                    System.out.print("Lampada 1: ");
                    lampada1.consultarConsumo();
                    System.out.print("Lampada 2: ");
                    lampada2.consultarConsumo();
                    break;

                default:
                    System.out.println("Saindo....");
                    break;
            }
        }
    }
}