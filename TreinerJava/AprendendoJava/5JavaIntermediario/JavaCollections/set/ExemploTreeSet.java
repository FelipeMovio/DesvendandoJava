package JavaCollections.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

        public static void main(String[] args) {
            // Criando um conjunto ordenado de strings
            Set<String> nomes = new TreeSet<>();

            // Adicionando elementos ao conjunto
            nomes.add("Alice");
            nomes.add("Bob");
            nomes.add("Charlie");
            nomes.add("Alice"); // Tentativa de adicionar duplicata

            // Imprimindo o conjunto
            System.out.println("Conjunto de nomes: " + nomes);
        }
    }


