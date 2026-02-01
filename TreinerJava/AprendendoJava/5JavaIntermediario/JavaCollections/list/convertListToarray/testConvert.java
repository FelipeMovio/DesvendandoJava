package JavaCollections.list.convertListToarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testConvert {
    public static void main(String[] args) {
        System.out.println("transformando List em Array/Vetor");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("---------");

        System.out.println("transformando Array/Vetor em List");
        Integer[] numerosArray = new Integer[4];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;
        numerosArray[3] = 4;
        List<Integer> arrayToList = new ArrayList<>(Arrays.asList(numerosArray));
        arrayToList.add(23);
        System.out.println(arrayToList);

    }
}
