package Loops;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("--- Exemplo de break e continue ---");
        for (int p = 0; p < 5; p++) {
            if (p == 2) {
                System.out.println("Pulando a iteração quando p é 2");
                continue; // Pula a iteração atual
            }
            if (p == 4) {
                System.out.println("Saindo do loop quando p é 4");
                break; // Sai do loop
            }
            System.out.println("Iteração: " + p);
        }

    }
}
