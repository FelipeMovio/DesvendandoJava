package DataHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Testes {
        public static void main(String[] args) {
            String tarefa = "Enviar relatório semanal";

            LocalDate dataCriacao = LocalDate.now();
            LocalTime horaCriacao = LocalTime.now();

            System.out.println("Tarefa: \"" + tarefa + "\"");
            System.out.println("Data de criação: " + dataCriacao);
            System.out.println("Hora de criação: " + horaCriacao);
        }
    }

 class Teste2 {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = dataAtual.format(formatoData);
        String horaFormatada = horaAtual.format(formatoHora);

        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Hora formatada: " + horaFormatada);
    }
}
