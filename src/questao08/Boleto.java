package questao08;

public class Boleto implements Pagamento {

    // Attributes
    private double divida;
    private double dinheiro;

    // Constructor

    public Boleto(double divida,double dinheiro) {
       this.divida = divida;
       this.dinheiro = dinheiro;
    }

    // Methods

    @Override
    public double realizarPagamento(){
        return divida - dinheiro;
    }

}
