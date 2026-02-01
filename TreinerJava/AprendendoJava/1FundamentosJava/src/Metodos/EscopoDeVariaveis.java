package Metodos;

public class EscopoDeVariaveis {
    public static void metodoExemplo() {
        int x = 10; // Variável local ao método
        System.out.println("Valor de x: " + x);
    }
    public static void main(String[] args) {
        metodoExemplo();
        // System.out.println(x); // Isso causaria um erro, pois x não é acessível aqui
    }
}
