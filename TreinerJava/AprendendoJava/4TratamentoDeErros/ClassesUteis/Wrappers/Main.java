package ClassesUteis.Wrappers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de produtos
        List<Produto> inventario = new ArrayList<>();
        // Adicionando produtos ao inventário
        inventario.add(new Produto(101, "Camiseta", 49.90, 20, true));
        inventario.add(new Produto(102, "Calça Jeans", 89.90, 15, true));
        inventario.add(new Produto(103, "Tênis", 199.90, 5, false));
        inventario.add(new Produto(104, "Boné", 29.90, 30, true));
        inventario.add(new Produto(105, "Mochila", 79.90, 10, true));
        // Exibindo informações dos produtos
        System.out.println("Inventário de Produtos:");
        for (Produto produto : inventario) {
            produto.exibirInformacoes();
        }
        // Exemplo de uso de autoboxing e unboxing
        Integer totalProdutos = 0; // Wrapper para int
        for (Produto produto : inventario) {
            totalProdutos += produto.getQuantidade(); // Unboxing
        }
        System.out.println("Total de Produtos em Estoque: " + totalProdutos);
    }
}

