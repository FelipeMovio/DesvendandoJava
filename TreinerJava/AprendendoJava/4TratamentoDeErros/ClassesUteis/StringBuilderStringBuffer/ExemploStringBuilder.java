package ClassesUteis.StringBuilderStringBuffer;

public class ExemploStringBuilder {
        public static void main(String[] args) {
            // Criando um StringBuilder
            StringBuilder sb = new StringBuilder();

            // Adicionando strings
            sb.append("Olá");
            sb.append(", ");
            sb.append("mundo!");

            // Convertendo para String e imprimindo
            String resultado = sb.toString();
            System.out.println("Resultado com StringBuilder: " + resultado);

            // Inserindo uma string em uma posição específica
            sb.insert(4, " bonito");
            System.out.println("Após inserção: " + sb.toString());

            // Removendo uma parte da string
            sb.delete(4, 12);
            System.out.println("Após remoção: " + sb.toString());

            // Substituindo uma parte da string
            sb.replace(0, 3, "Oi");
            System.out.println("Após substituição: " + sb.toString());
        }
    }

