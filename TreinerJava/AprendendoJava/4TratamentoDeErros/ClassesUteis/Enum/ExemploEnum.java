package ClassesUteis.Enum;

public class ExemploEnum {

        public static void main(String[] args) {
            DiasdaSemana hoje = DiasdaSemana.SEGUNDA;

            // Usando um switch para verificar o dia da semana
            switch (hoje) {
                case DOMINGO:
                    System.out.println("Hoje é domingo!");
                    break;
                case SEGUNDA:
                    System.out.println("Hoje é segunda-feira!");
                    break;
                case TERÇA:
                    System.out.println("Hoje é terça-feira!");
                    break;
                case QUARTA:
                    System.out.println("Hoje é quarta-feira!");
                    break;
                case QUINTA:
                    System.out.println("Hoje é quinta-feira!");
                    break;
                case SEXTA:
                    System.out.println("Hoje é sexta-feira!");
                    break;
                case SÁBADO:
                    System.out.println("Hoje é sábado!");
                    break;
            }
        }
    }


