package org.example;

public class ItemPedido {

    private Produto produto;
    private int quantidade;

    //RNF01
    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //RF01
    public Produto getProduto() {
        return produto;
    }

    //RN01 e RF01
    public double calcularSubtotal(){
        return produto.getPrecoUnit() * quantidade;
    }
}
