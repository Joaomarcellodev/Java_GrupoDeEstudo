package questao09;

public class Endereço {

    // Attributes

    private String rua;
    private int numero;
    private String cidade;

    // Constructor

    public Endereço(String rua, int numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    // Methods

    @Override
    public String toString() {
        return "Endereço{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                '}';
    }


    // Getters and Setters


    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
