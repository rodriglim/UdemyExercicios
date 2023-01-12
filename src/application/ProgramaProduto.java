package application;

import entities.Produto;

public class ProgramaProduto {

    public static void main(String[] args) {

        Produto p1 = new Produto("TV", 900.00, 668);
        Produto p2 = new Produto("Geladeira", 2500);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}
