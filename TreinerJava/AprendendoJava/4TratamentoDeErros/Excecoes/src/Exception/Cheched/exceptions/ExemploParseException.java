package Exception.Cheched.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploParseException {
    public static void main(String[] args) {
        String dataStr = "2023-10-01";
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date data = formato.parse(dataStr);
            System.out.println("Data analisada: " + data);
        } catch (ParseException e) {
            System.out.println("Erro ao analisar a data: " + e.getMessage());
        }
    }
}
//O código tenta analisar uma string que representa uma data no formato "yyyy-MM-dd".
//Se a string não estiver no formato correto, a ParseException é lançada e capturada no bloco catch,
//exibindo uma mensagem de erro.
//Esse exemplo é útil para garantir que as strings de data sejam convertidas corretamente em objetos Date,
//evitando erros em operações que dependem de datas.