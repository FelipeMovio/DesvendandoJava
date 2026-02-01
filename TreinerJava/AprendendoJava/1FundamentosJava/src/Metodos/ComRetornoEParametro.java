package Metodos;

public class ComRetornoEParametro {
    // Método que soma dois números e retorna o resultado
    public static int somar(int a, int b) {
        return a + b; // Retorna a soma de a e b
    }
    public static void main(String[] args) {
        int resultado = somar(5, 10); // Chama o método somar
        System.out.println("Resultado da soma: " + resultado);
    }
}
