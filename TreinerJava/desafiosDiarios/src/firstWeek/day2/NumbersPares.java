package firstWeek.day2;

import java.util.Scanner;

public class NumbersPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero : ");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Este numero é par");
        } else {
            System.out.println("Este numero é impar");
        }
        scanner.close();
    }
}
