package JavaCollections.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

        public static void main(String[] args) {
            // Criando um HashMap
            Map<String, Integer> idadeMap = new HashMap<>();

            // Adicionando pares chave-valor
            idadeMap.put("Alice", 30);
            idadeMap.put("Bob", 25);
            idadeMap.put("Charlie", 35);

            // Imprimindo o HashMap
            System.out.println("Idades: " + idadeMap);

            // Acessando um valor
            int idadeAlice = idadeMap.get("Alice");
            System.out.println("Idade de Alice: " + idadeAlice);

            // Removendo um par chave-valor
            idadeMap.remove("Bob");
            System.out.println("Idades após remoção: " + idadeMap);
        }
    }

