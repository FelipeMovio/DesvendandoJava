package ClassesUteis.Generics;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> Bag = new BolsaNinja<>();
        Bag.addFerramenta(new Kunai("explosiva"));
        Bag.addFerramenta(new Shuriken(10));
        Bag.addFerramenta(new Kunai("normal"));
        Bag.addFerramenta(new Pergaminho("Do rei"));
        System.out.println("Itens na nossa bolsa:");
        Bag.mostrarFerramenta();

    }
}
