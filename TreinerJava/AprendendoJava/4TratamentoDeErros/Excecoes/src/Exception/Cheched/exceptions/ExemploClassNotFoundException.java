package Exception.Cheched.exceptions;

public class ExemploClassNotFoundException {
    public static void main(String[] args) {
        try {
            java.lang.Class.forName("com.exemplo.ClasseInexistente");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada: " + e.getMessage());
        }
    }
}
//O código tenta carregar uma classe chamada ClasseInexistente usando o método Class.forName().
//Se a classe não estiver disponível, a ClassNotFoundException é lançada e capturada no bloco catch, exibindo uma mensagem de erro.
//Esse exemplo é útil para verificar se uma classe está presente antes de usá-la, evitando erros em tempo de execução.
