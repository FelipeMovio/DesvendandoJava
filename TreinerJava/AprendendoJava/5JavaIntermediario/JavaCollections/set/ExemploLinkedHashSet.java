package JavaCollections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

        public static void main(String[] args) {
            // Criando um conjunto encadeado de inteiros
            Set<Integer> numeros = new LinkedHashSet<>();

            // Adicionando elementos ao conjunto
            numeros.add(10);
            numeros.add(20);
            numeros.add(30);
            numeros.add(10); // Tentativa de adicionar duplicata

            // Imprimindo o conjunto
            System.out.println("Conjunto de números: " + numeros);

            // Removendo um elemento
            numeros.remove(20);
            System.out.println("Conjunto após remoção: " + numeros);
        }
    }

