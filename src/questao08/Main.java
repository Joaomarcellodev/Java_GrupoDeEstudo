package questao08;

public class Main {

    public static void main(String[] args) {

        Boleto b = new Boleto(3000.00,2000);

        System.out.println(b.realizarPagamento());

        CartaoCredito c = new CartaoCredito(2000.00,3000.00);

        System.out.println(c.realizarPagamento());
    }
}
