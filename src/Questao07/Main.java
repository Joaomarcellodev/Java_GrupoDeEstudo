package Questao07;

public class Main {

    public static void main(String[] args) {

        Forma c = new Circulo(5);

        System.out.println(c.calcularArea());

        Forma r = new Retangulo(3,8);

        System.out.println(r.calcularArea());
    }
}
