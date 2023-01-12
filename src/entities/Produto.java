package entities;

import java.util.Locale;
import java.text.NumberFormat;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String valorTotalEstoque() {
        return formatarMoeda(this.getPreco() * this.getQuantidade());
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        if (this.getQuantidade() <= quantidade) {
            System.out.println("Quantidade não disponivel no estoque");
        } else {
            this.quantidade -= quantidade;
        }

    }

    private String formatarMoeda(double valor) {
        Locale localeBrasil = new Locale("pt", "BR");
        String moeda = NumberFormat.getCurrencyInstance(localeBrasil).format(valor);
        return moeda;
    }
    @Override
    public String toString() {

        String format = String.format("Produto: %s, Preço: %s, "
                + "Quantidade: %d, Valor total: %s", nome, formatarMoeda(preco), quantidade, valorTotalEstoque());
        return format;
    }

}
