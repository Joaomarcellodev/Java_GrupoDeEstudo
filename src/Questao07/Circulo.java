package Questao07;

public class Circulo extends Forma {

    // Attributes
    private double raio;


    // Constructor

    public Circulo(double raio) {
        this.raio = raio;
    }

    // Methods

    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }

    // Getters and Setters


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
