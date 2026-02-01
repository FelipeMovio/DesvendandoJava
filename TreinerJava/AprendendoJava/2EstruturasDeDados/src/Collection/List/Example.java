package Collection.List;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
    // List é uma coleção ordenada , uma sequencia. Podemos acessar os elementos por índice.
        /*
        Adicionar Alguns metodos a mais :
        - add(int index, E element) : Adiciona o elemento na posição especificada.
        - remove(int index) : Remove o elemento na posição especificada.
        - set(int index, E element) : Substitui o elemento na posição especificada
        - get(int index) : Retorna o elemento na posição especificada.
        Implementações mais famosas:
        - ArrayList : um array.
        - LinkedList : uma lista ligada, onde cada elemento aponta para o próximo.
        - Vector : Uma versão antiga de lista.
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(45);
        numbers.add(67);
        numbers.add(89);

        // quantidade de elementos
        int qauntidade = numbers.size();

        // remover o ultimo elemento
        numbers.remove(numbers.size() - 1);
        int ultimo = numbers.get(numbers.size() - 1);
        System.out.println(ultimo);

        for(Integer num : numbers) {
            System.out.println(num);
        }
    }
}
