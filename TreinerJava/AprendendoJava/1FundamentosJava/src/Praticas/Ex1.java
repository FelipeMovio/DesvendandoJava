package Praticas;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Double nota1 = 5.;
        Double nota2 = 9.7;
        Double nota3 = 8.2;

        Double media = (nota1 + nota2 + nota3) / 3;

        System.out.println(media);

    }
}

class Ex1ComScaner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite nota 1 ");
        Double nota1 = sc.nextDouble();

        System.out.println(" Digite nota 2 ");
        Double nota2 = sc.nextDouble();

        System.out.println(" Digite nota 3 ");
        Double nota3 = sc.nextDouble();

        Double media = (nota1 + nota2 + nota3) / 3;

        System.out.println(" a media das notas sao : " + media);

        sc.close();
    }
}
