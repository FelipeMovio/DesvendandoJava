package JavaCollections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHashMap {

        public static void main(String[] args) {
            // Criando um LinkedHashMap
            Map<String, Integer> idadeMap = new LinkedHashMap<>();

            // Adicionando pares chave-valor
            idadeMap.put("Alice", 30);
            idadeMap.put("Bob", 25);
            idadeMap.put("Charlie", 35);

            // Imprimindo o LinkedHashMap
            System.out.println("Idades: " + idadeMap);

            // Acessando um valor
            int idadeCharlie = idadeMap.get("Charlie");
            System.out.println("Idade de Charlie: " + idadeCharlie);

            // Removendo um par chave-valor
            idadeMap.remove("Alice");
            System.out.println("Idades após remoção: " + idadeMap);
        }
    }


