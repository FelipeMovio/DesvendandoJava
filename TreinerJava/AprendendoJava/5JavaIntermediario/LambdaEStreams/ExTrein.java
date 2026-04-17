package LambdaEStreams;

import java.util.*;
import java.util.stream.Collectors;

public class ExTrein {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        // código do agrupamento

        Integer maior = numeros.stream()
                .max(Integer ::compareTo)
                .orElse(null);

        Integer menor = numeros.stream()
                        .min(Integer :: compareTo).orElse(null);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);


        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        // código do agrupamento
        Map<Integer, List<String>> agrupadoPorTamanho = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(agrupadoPorTamanho);

        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        // código da filtragem e agrupamento dos dados

        Integer paresX = numeros2.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();
        System.out.println(paresX);

        List<Integer> numeros3 = Arrays.asList(1, 2, 3, 4, 5, 6);
        // código do particionamento da lista

        Map<Boolean, List<Integer>> particao = numeros3.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> pares = particao.get(true);

        List<Integer> impares = particao.get(false);

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

    }

}
