package questao09;

public class Main {

    public static void main(String[] args) {

        Endereço m = new Endereço("Rua Barroso",2350,"Teresina");

        Pessoa jm = new Pessoa("João",m);

        System.out.println(jm);
    }
}
