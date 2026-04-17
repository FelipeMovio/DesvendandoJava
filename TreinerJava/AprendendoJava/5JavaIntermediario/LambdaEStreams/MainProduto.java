package LambdaEStreams;


import java.util.*;
import java.util.stream.Collectors;

public class MainProduto {
        public static void main(String[] args) {
            List<ProdutoStreamTrein> produtos = Arrays.asList(
                    new ProdutoStreamTrein("Smartphone", 800.0, "Eletrônicos"),
                    new ProdutoStreamTrein("Notebook", 1500.0, "Eletrônicos"),
                    new ProdutoStreamTrein("Teclado", 200.0, "Eletrônicos"),
                    new ProdutoStreamTrein("Cadeira", 300.0, "Móveis"),
                    new ProdutoStreamTrein("Monitor", 900.0, "Eletrônicos"),
                    new ProdutoStreamTrein("Mesa", 700.0, "Móveis")
            );

            // código usando streams

            //Dada a lista de produtos acima, agrupe-os por categoria em um Map<String, List<Produto>>.
            Map<String, List<ProdutoStreamTrein>> agrupamentos = produtos.stream()
                    .collect(Collectors.groupingBy(ProdutoStreamTrein::getCategoria));

            agrupamentos.forEach((categoria, produtoStreamTreins) ->{
                System.out.println(categoria + ":" + produtoStreamTreins);
            });

            //Dada a lista de produtos acima, conte quantos produtos há em cada categoria e armazene em um Map<String, Long>.
            Map<String,Long> totalDeProdutosPorCat = produtos.stream()
                    .collect(Collectors.groupingBy(ProdutoStreamTrein::getCategoria,Collectors.counting()));

            System.out.println(totalDeProdutosPorCat);

            //Dada a lista de produtos acima, encontre o produto mais caro de cada categoria e armazene o resultado em um Map<String, Optional<Produto>>.
            Map<String, Optional<ProdutoStreamTrein>> maisCaroPorCat = produtos.stream()
                    .collect(Collectors.groupingBy(ProdutoStreamTrein::getCategoria,
                            Collectors.maxBy(Comparator.comparingDouble(ProdutoStreamTrein::getPreco))));


            maisCaroPorCat.forEach((categoria, produto) ->
                    System.out.println(categoria + " -> " + produto.orElse(null)));

            //Dada a lista de produtos acima, calcule o total dos preços dos produtos em cada categoria e armazene o resultado em um Map<String, Double>.
            Map<String, Double> totalPrecoPorCat = produtos.stream()
                    .collect(Collectors.groupingBy(ProdutoStreamTrein::getCategoria,
                            Collectors.summingDouble(ProdutoStreamTrein::getPreco)));

            System.out.println(totalPrecoPorCat);
        }
    }

