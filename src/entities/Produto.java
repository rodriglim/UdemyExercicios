package entities;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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

    public double valorTotalEstoque() {
        return this.getPreco() * this.getQuantidade();
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        if(this.getQuantidade() <= quantidade){
            System.out.println("Quantidade não disponivel no estoque");
        }else{
            this.quantidade -= quantidade;
        }
     
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade +", Total Preço = " + valorTotalEstoque() + '}';
    }
    
    
}
