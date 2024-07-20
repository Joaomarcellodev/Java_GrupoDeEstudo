package questao09;

public class Pessoa {

    // Attributes

    private String nome;
    private Endereço endereco;

    // Constructor

    public Pessoa(String nome, Endereço endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Methods


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                '}';
    }

    // Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }
}
