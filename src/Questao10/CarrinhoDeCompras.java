package Questao10;


import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Produto> produtos;


    // Constructor

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }


    // Methods

    public void adicionar(Produto produto){
        produtos.add(produto);
    }

    public void remover(Produto produto){
        produtos.remove(produto);
    }

    public void listar(){
        for ( Produto produto : produtos){
            System.out.println("Produto: " + produto.getNome() + " | Preço: " + produto.getPreco());
        }

    }

    public double calcularTotal(){
            double total = 0;
            for (Produto produto : produtos){
                total += produto.getPreco();
            }

            return total;
    }
}
