package JavaCollections.set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

        public static void main(String[] args) {
            // Criando um conjunto de strings
            Set<String> frutas = new HashSet<>();

            // Adicionando elementos ao conjunto
            frutas.add("Maçã");
            frutas.add("Banana");
            frutas.add("Laranja");
            frutas.add("Maçã"); // Tentativa de adicionar duplicata

            // Imprimindo o conjunto
            System.out.println("Conjunto de frutas: " + frutas);

            // Verificando se um elemento está no conjunto
            boolean temBanana = frutas.contains("Banana");
            System.out.println("Contém Banana? " + temBanana);

            // Removendo um elemento
            frutas.remove("Laranja");
            System.out.println("Conjunto após remoção: " + frutas);
        }
    }


