package questao08;

public class CartaoCredito implements Pagamento{

    // Attributes

    private double quantiaDinheiro;
    private double dividaCartao;

    // Constructor

    public CartaoCredito(double quantiaDinheiro,double dividaCartao) {
        this.quantiaDinheiro = quantiaDinheiro;
        this.dividaCartao = dividaCartao;
    }

    // Methods

    @Override
    public double realizarPagamento(){
        return  dividaCartao - quantiaDinheiro ;
    }

}
