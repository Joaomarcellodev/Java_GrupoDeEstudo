package Questao06;

public class Gato extends Animal{

    // Attributes
    String raca;
    String cor;

    // Constructor

    public Gato(String nome,String raca,String cor){
        super(nome);
        this.raca = raca;
        this.cor = cor;

    }

    // Methods

    @Override
    public void fazerSom(){
        System.out.println("Eu sou um gato e faço Miau Miau");
    }


    @Override
    public String toString() {
        return "Gato{" +
                "raca='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
