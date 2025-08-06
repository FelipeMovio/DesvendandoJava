package Lanchonete;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Item> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        System.out.println("Item adicionado: " + item.getNome());
    }

    public void removerItem(int codigo) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getCodigo() == codigo) {
                itens.remove(i);
                System.out.println("Item removido com sucesso.");
            }
        }
    }

    public void calcularPreco() {
        double valor = 0;
        for (int i = 0; i < itens.size(); i++) {
            valor += itens.get(i).getPreco();
        }
        System.out.println("Preço total: R$ " + valor);
    }
}
