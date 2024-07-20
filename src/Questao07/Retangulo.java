package Questao07;

public class Retangulo extends Forma{

    // Attributes
    private double altura;
    private double largura;

    // Constructor

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    // Methods

    @Override
    public double calcularArea(){
        return largura * altura;
    }
}
