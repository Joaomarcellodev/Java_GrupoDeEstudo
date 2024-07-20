package Questao10;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("Produto 1", 100.0);
        Produto p2 = new Produto("Produto 2", 150.0);
        Produto p3 = new Produto("Produto 3", 200.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionar(p1);
        carrinho.adicionar(p2);
        carrinho.adicionar(p3);

        System.out.println("Produtos no carrinho:");
        carrinho.listar();

        System.out.println("\nProdutos no carrinho após remoção:");
        carrinho.listar();

        System.out.println("Total do carrinho após remoção: " + carrinho.calcularTotal());
    }
}
