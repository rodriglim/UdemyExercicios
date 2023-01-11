package application;

import entities.Produto;

public class ProgramaProduto {

    public static void main(String[] args) {

        Produto p = new Produto("TV", 900.00, 10);

        System.out.println(p.toString());

        p.adicionarProduto(5);
        System.out.println(p.toString());
        p.removerProduto(45);
        System.out.println(p.toString());
        p.removerProduto(5);
        System.out.println(p.toString());

    }
}
