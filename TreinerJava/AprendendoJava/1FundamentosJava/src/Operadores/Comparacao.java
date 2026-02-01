package Operadores;

public class Comparacao {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean igual = (x == y);          // Igual a
        boolean diferente = (x != y);      // Diferente de
        boolean maior = (x > y);           // Maior que
        boolean menor = (x < y);           // Menor que
        boolean maiorOuIgual = (x >= y);   // Maior ou igual a
        boolean menorOuIgual = (x <= y);   // Menor ou igual a

        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou Igual: " + maiorOuIgual);
        System.out.println("Menor ou Igual: " + menorOuIgual);

    }
}
