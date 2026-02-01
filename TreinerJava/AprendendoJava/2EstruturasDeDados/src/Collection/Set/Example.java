package Collection.Set;

import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {

        // SET - TreeSet
        // Arvvore.

        TreeSet<Integer> arvore = new TreeSet<>();
        // segue o conceito de arvore binaria
        //4, 2, 3, 1, 5, 8 - add Elementos
        arvore.add(4);
        arvore.add(2);
        arvore.add(3);
        arvore.add(1);
        arvore.add(5);
        arvore.add(8);

        int primeiro = arvore.first();
        int ultimo = arvore.last();

        System.out.println("Primeiro : " + primeiro + " E ultimo : " + ultimo);

        // Removendp Elementos
        arvore.remove(3);
        System.out.println(arvore);

    }
}
