package br.edu.ifsul.controller;
import br.edu.ifsul.model.Produto;

public class AppProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        System.out.println(produto);
        produto.setNome("batata");
        produto.setDescricao("É gostoso!");
        produto.setEstoque(10);
        produto.setValor(7.99);
        System.out.println(produto);
        System.out.println(produto.getNome());
        System.out.println(produto.getDescricao());
        System.out.println(produto.getEstoque());
        System.out.println(produto.getValor());

        Produto produto2 = new Produto("mauricio", "lindo", 90.00, 2);
        System.out.println(produto2);
    }
}