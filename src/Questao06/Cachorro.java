package Questao06;

public class Cachorro extends Animal{

    // Attributes
    String raca;
    String tamanho;

    // Constructor

    public Cachorro(String nome,String raca,String tamanho){
        super(nome);
        this.raca = raca;
        this.tamanho = tamanho;
    }

    // Methods

    @Override
    public void fazerSom(){
        System.out.println("Sou um cachorro e faço Au Au Au");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
