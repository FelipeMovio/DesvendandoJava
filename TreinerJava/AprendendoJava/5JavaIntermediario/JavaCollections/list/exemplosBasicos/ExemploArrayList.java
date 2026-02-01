package JavaCollections.list.exemplosBasicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

        public static void main(String[] args) {
            // Criando uma lista de strings
            // Usando o ArrayList
            List<String> frutas = new ArrayList<>();

            // Adicionando elementos à lista
            frutas.add("Maçã");
            frutas.add("Banana");
            frutas.add("Laranja");

            // Imprimindo a lista
            for ( String fruta : frutas){
                System.out.println("Lista de frutas: " + fruta);
            }


            // Acessando um elemento
            String primeiraFruta = frutas.getFirst();
            System.out.println("Primeira fruta: " + primeiraFruta);

            // Removendo um elemento
            frutas.remove("Banana");
            System.out.println("Lista após remoção: " + frutas);


            List<String> desenhos = new ArrayList<>();
            desenhos.add("Dragon Ball");
            desenhos.add("Cavaleiros do Zodiaco");
            desenhos.add("Yu Yu Hakusho");
            desenhos.add("Naruto");
            desenhos.add("One Piece");
            desenhos.add("Bleach");
            desenhos.add("Death Note");
            desenhos.add("Fullmetal Alchemist");
            desenhos.add("Attack on Titan");

            // ordenando ordem alfabetica
            Collections.sort(desenhos);
            for (String desenho : desenhos){
                System.out.println(desenho);
            }

        }
    }





