package org.example;

public class Main {

    static void main(String[] args) {

        Produto produto1 = new Produto("Caderno", 12.00);
        ItemPedido itemPedido = new ItemPedido(produto1, 3);


        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Preço R$: " + produto1.getPrecoUnit());
        System.out.println("Quantidade: " + itemPedido.getQuantidade());
        System.out.println("Subtotal R$: " + itemPedido.calcularSubtotal());
    }
}
