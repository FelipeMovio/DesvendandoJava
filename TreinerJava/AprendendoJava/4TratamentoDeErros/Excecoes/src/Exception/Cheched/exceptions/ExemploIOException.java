package Exception.Cheched.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploIOException {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o leitor: " + e.getMessage());
            }
        }
    }
}
//O código tenta abrir um arquivo chamado "arquivo.txt" e lê seu conteúdo linha por linha.
//O bloco try contém o código que pode lançar uma IOException.
//Se ocorrer um erro ao ler o arquivo (por exemplo, se o arquivo não existir), a exceção é capturada no bloco catch,
//e uma mensagem de erro é exibida.
//O bloco finally é usado para garantir que o BufferedReader seja fechado,
//mesmo que ocorra uma exceção. Se houver um erro ao fechar o leitor, ele também é tratado.
