package Questao01_02_03_04;

public class Main {

    public static void main(String[] args) {

        Carro a = new Carro();

        a.setModelo("Corolla");
        a.setMarca("Toyota");
        a.setAno(2024);

        System.out.println("O modelo do carro é " + a.getModelo());
        System.out.println("A marca do carro é " + a.getMarca());
        System.out.println("O ano do carro é " + a.getAno());

        Carro b = new Carro("Prisma","Chevrolet",2024);

        System.out.println("O modelo do carro é " + b.getModelo());
        System.out.println("A marca do carro é " + b.getMarca());
        System.out.println("O ano do carro é " + b.getAno());

        b.acelerar();

    }
}
