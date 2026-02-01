package firstWeek.day5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Soma n = new Soma();
        System.out.println("escolha primeiro numero da soma");
        int a = sc.nextInt();
        System.out.println("escolha segundo numero da soma");
        int b = sc.nextInt();
        n.somar(a,b);
        n.subtrair(a,b);
        sc.close();
    }
}
