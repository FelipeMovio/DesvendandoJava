package Exception.Unchecked.exceptions;

public class RunTimeException {
    public static void main(String[] args) {

        // NullPointerException
        String texto = null;
        // Tentativa de acessar o comprimento de uma string nula
        try {
            System.out.println("O comprimento do texto é: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("Erro: Tentativa de acessar um método em um objeto nulo.");
        }
    }
}

class ExemploArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};

        try {
            // Tentativa de acessar um índice fora dos limites do array
            System.out.println("Número no índice 5: " + numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array.");
        }
    }
}

class ExemploClassCastException {
    public static void main(String[] args) {
        Object objeto = "Uma string";

        try {
            // Tentativa de fazer um cast incorreto
            Integer numero = (Integer) objeto;
        } catch (ClassCastException e) {
            System.out.println("Erro: Não é possível fazer cast de String para Integer.");
        }
    }
}

class ExemploIllegalArgumentException {
    public static void main(String[] args) {
        try {
            // Chamada de método com argumento inválido
            verificarIdade(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void verificarIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        }
        System.out.println("Idade válida: " + idade);
    }
}
