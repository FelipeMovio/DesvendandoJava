package Condicionais;

public class IF {

    public static void main(String[] args) {
        // Exemplo 1: Estrutura 'if' simples
        int numero1 = 10;
        System.out.println("\n--- Exemplo 1: Estrutura 'if' simples ---");
        if (numero1 > 0) {
            System.out.println(numero1 + " é positivo.");
        }

        // Exemplo 2: Estrutura 'if-else'
        int numero2 = -5;
        System.out.println("\n--- Exemplo 2: Estrutura 'if-else' ---");
        if (numero2 > 0) {
            System.out.println(numero2 + " é positivo.");
        } else {
            System.out.println(numero2 + " é negativo ou zero.");
        }

        // Exemplo 3: Estrutura 'if-else if-else' (múltiplas condições)
        int numero3 = 0;
        System.out.println("\n--- Exemplo 3: Estrutura 'if-else if-else' ---");
        if (numero3 > 0) {
            System.out.println(numero3 + " é positivo.");
        } else if (numero3 < 0) {
            System.out.println(numero3 + " é negativo.");
        } else {
            System.out.println(numero3 + " é zero.");
        }
    }
}

