package JavaCollections.list.exemplosBasicos;

import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String[] args) {
        // Criando uma lista encadeada de inteiros
        // Usando o LinkedList
        List<Integer> numeros = new LinkedList<>();

        // Adicionando elementos à lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Imprimindo a lista
        System.out.println("Lista de números: " + numeros);

        // Acessando um elemento
        int primeiroNumero = numeros.get(0);
        System.out.println("Primeiro número: " + primeiroNumero);

        // Removendo um elemento
        numeros.remove(1); // Remove o elemento na posição 1
        System.out.println("Lista após remoção: " + numeros);
    }
}
