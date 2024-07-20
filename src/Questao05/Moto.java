package Questao05;

public class Moto extends Veiculo{

    // Attributes

    String cilindradas;

    // Constructor


    public Moto(String cilindradas,String modelo,String marca) {
        super(modelo, marca);
        this.cilindradas = cilindradas;
    }

    // Methodods

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas='" + cilindradas + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
