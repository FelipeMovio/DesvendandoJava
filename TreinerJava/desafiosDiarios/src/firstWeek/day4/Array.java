package firstWeek.day4;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(20);
        numeros.add(11);
        numeros.add(74);
        numeros.add(19);
        numeros.add(5);
        numeros.add(22);
        Integer maior = Integer.MIN_VALUE;
        Integer menor = Integer.MAX_VALUE;
        for (int i = 0; i < numeros.size(); i ++){
            if (numeros.get(i) > maior){
                maior = numeros.get(i);
            }
            if (numeros.get(i) < menor){
                menor = numeros.get(i);
            }
        }
        System.out.println("Maior valor é " + maior);
        System.out.println("Menor valor é " + menor);

    }
}
