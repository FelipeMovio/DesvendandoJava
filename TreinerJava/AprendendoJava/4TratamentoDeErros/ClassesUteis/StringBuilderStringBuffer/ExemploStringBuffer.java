package ClassesUteis.StringBuilderStringBuffer;

public class ExemploStringBuffer {
        public static void main(String[] args) {
            // Criando um StringBuffer
            StringBuffer sbf = new StringBuffer();

            // Adicionando strings
            sbf.append("Olá");
            sbf.append(", ");
            sbf.append("mundo!");

            // Convertendo para String e imprimindo
            String resultado = sbf.toString();
            System.out.println("Resultado com StringBuffer: " + resultado);

            // Inserindo uma string em uma posição específica
            sbf.insert(4, " bonito");
            System.out.println("Após inserção: " + sbf.toString());

            // Removendo uma parte da string
            sbf.delete(4, 12);
            System.out.println("Após remoção: " + sbf.toString());

            // Substituindo uma parte da string
            sbf.replace(0, 3, "Oi");
            System.out.println("Após substituição: " + sbf.toString());
        }
    }


