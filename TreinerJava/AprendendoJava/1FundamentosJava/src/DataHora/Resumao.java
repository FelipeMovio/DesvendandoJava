package DataHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Resumao {

    public static void main(String[] args) {
        // ===============================
        // 1. Data
        // ===============================
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        LocalDate dataEspecifica = LocalDate.of(2026, 3, 18);
        System.out.println("Data específica: " + dataEspecifica);

        LocalDate amanha = dataAtual.plusDays(1);
        System.out.println("Amanhã: " + amanha);

        LocalDate semanaPassada = dataAtual.minusWeeks(1);
        System.out.println("Semana passada: " + semanaPassada);

        // ===============================
        // 2. Hora
        // ===============================
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual);

        LocalTime horaEspecifica = LocalTime.of(14, 30, 15); // 14h30m15s
        System.out.println("Hora específica: " + horaEspecifica);

        LocalTime horaFutura = horaAtual.plusHours(2).plusMinutes(15);
        System.out.println("Hora futura: " + horaFutura);

        // ===============================
        // 3. Data e Hora
        // ===============================
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora atual: " + dataHoraAtual);

        LocalDateTime dataHoraEspecifica = LocalDateTime.of(2026, 3, 18, 14, 30, 15);
        System.out.println("Data e hora específica: " + dataHoraEspecifica);

        LocalDateTime dataHoraFutura = dataHoraAtual.plusDays(5).plusHours(3);
        System.out.println("Data e hora futura: " + dataHoraFutura);

        // ===============================
        // 4. Fuso horário
        // ===============================
        ZonedDateTime zonedNow = ZonedDateTime.now();
        System.out.println("Data e hora com fuso horário padrão: " + zonedNow);

        ZonedDateTime zonedNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Data e hora em Nova York: " + zonedNY);

        // ===============================
        // 5. Formatação
        // ===============================
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formatoCompleto = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Data formatada: " + dataAtual.format(formatoData));
        System.out.println("Hora formatada: " + horaAtual.format(formatoHora));
        System.out.println("Data e hora formatada: " + dataHoraAtual.format(formatoCompleto));

        // ===============================
        // 6. Parsing (String -> Data/Hora)
        // ===============================
        String dataString = "25/12/2026";
        LocalDate natal = LocalDate.parse(dataString, formatoData);
        System.out.println("Natal: " + natal);

        String horaString = "18:45:30";
        LocalTime horaEvento = LocalTime.parse(horaString, formatoHora);
        System.out.println("Hora do evento: " + horaEvento);

        String dataHoraString = "31/12/2026 23:59:59";
        LocalDateTime viradaAno = LocalDateTime.parse(dataHoraString, formatoCompleto);
        System.out.println("Virada de ano: " + viradaAno);

        // ===============================
        // 7. Diferenças entre datas/horas
        // ===============================
        long diasEntre = ChronoUnit.DAYS.between(dataAtual, natal);
        System.out.println("Dias até o Natal: " + diasEntre);

        long horasEntre = ChronoUnit.HOURS.between(horaAtual, horaEvento);
        System.out.println("Horas até o evento: " + horasEntre);

        long minutosEntre = ChronoUnit.MINUTES.between(dataHoraAtual, viradaAno);
        System.out.println("Minutos até a virada de ano: " + minutosEntre);
    }
}
