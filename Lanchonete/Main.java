package Lanchonete;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Cachorro Quente", 5.50);
        Item item2 = new Item("Hambúrguer", 10.00);
        Item item3 = new Item("Refrigerante", 3.00);

        Carrinho c = new Carrinho();
        c.adicionarItem(item1);
        c.adicionarItem(item2);
        c.adicionarItem(item3);
        c.calcularPreco();
    }

}
