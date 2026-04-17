package LambdaEStreams;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

            Map<String, List<ProdutoStreamTrein>> agrupamentos = produtos.stream()
                    .collect(Collectors.groupingBy(ProdutoStreamTrein::getCategoria));

            agrupamentos.forEach((categoria, produtoStreamTreins) ->{
                System.out.println(categoria + ":" + produtoStreamTreins);
            });
        }
    }

