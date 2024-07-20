package Questao10;

public class Produto {

    // Attributes

    private String nome;
    private double preco;

    // Constructor

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Methods

    //Getters and Setters


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
}
