package Questao01_02_03_04;

public class Carro {

    // Attributes

    private String marca;
    private String modelo;
    private int ano;

    // Constructor


    public Carro() {

    }

    public Carro(String modelo,String marca,int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }


    // Methods

    public void acelerar(){
        System.out.println("O carro está acelerando....");
    }

    // Getters and Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
