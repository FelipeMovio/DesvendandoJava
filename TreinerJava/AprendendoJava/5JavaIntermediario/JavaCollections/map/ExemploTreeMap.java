package JavaCollections.map;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

        public static void main(String[] args) {
            // Criando um TreeMap
            Map<String, Integer> idadeMap = new TreeMap<>();

            // Adicionando pares chave-valor
            idadeMap.put("Alice", 30);
            idadeMap.put("Bob", 25);
            idadeMap.put("Charlie", 35);

            // Imprimindo o TreeMap
            System.out.println("Idades: " + idadeMap);

            // Acessando um valor
            int idadeBob = idadeMap.get("Bob");
            System.out.println("Idade de Bob: " + idadeBob);
        }
    }

