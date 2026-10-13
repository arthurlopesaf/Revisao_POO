package org.example;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    //RN01
    public void calcularPagamento() {
        double bonus = 100.00;

        double salarioTotal = getSalario() + bonus;

        System.out.printf("Vendedor: %s, salário base: %.2f, pagamento: %.2f%n",
                getNome(), getSalario(), salarioTotal);
    }
}
