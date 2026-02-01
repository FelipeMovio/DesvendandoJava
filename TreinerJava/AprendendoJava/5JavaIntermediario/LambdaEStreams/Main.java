package LambdaEStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Cliente> c1 = new ArrayList<>();
        c1.add(new Cliente("cluadia", 21));
        c1.add(new Cliente("ney", 69));
        c1.add(new Cliente("marcos", 21));
        c1.add(new Cliente("david", 51));
        c1.add(new Cliente("carlos", 33));
        c1.add(new Cliente("algusto", 28));
        c1.add(new Cliente("amaral", 24));

        System.out.println("LISTA COM TODOS CLIENTES");
        // Exemplo de Lambda para listar todos os objetos, como se fosse um for
        c1.forEach(c -> {
            System.out.println(c.getNome() + " com idade : " + c.getIdade());
        });


        // Exemplo de usando steam
        List<Cliente> c1Filter = c1.stream()
                .filter(c -> c.getIdade() < 30) // filtro de idade
                .toList();

        System.out.println("LISTA COM CLIENTES COM MENOS DE 30 ANOS");
        // Exemplo de Lambda para listar todos os objetos, como se fosse um for
        c1Filter.forEach(c -> {
            System.out.println(c.getNome() + " com idade : " + c.getIdade());
        });

    }
}

