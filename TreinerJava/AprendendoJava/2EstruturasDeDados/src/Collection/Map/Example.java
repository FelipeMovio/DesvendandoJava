package Collection.Map;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {

        //Chave - valor
        HashMap<String, Integer> mapa = new HashMap<>();
             //<Chave, Valor>
        // Adicionando elementos
        mapa.put("Maçã", 10);
        mapa.put("Banana", 20);
        mapa.put("Laranja", 15);

        // Removendo um elemento
        mapa.remove("Banana");
                   // Informar chave ou valor

        // Acessando elementos
                //int quantidadeMaca = mapa.get("Maçã");
                // só usar get().

        // Iterações
        for (String chave : mapa.keySet()) {
            int valor = mapa.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }
    }
}
