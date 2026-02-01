package firstWeek.day3;

import java.util.Scanner;

public class SomarNumeros {
    public static void main(String[] args) {
        somarNUmeros();
    }

    static void somarNUmeros(){
        System.out.println(" Somando numeros de 1 a 100 ");
        int soma = 0 ;
        for (int i = 0; i < 101 ; i++){
            soma += i;

        }
        System.out.println(soma);
    }



    static void tabuadaSimples() {
       System.out.println("imprimindo uma tabuada");
       int number = 5;
       for (int i = 0; i < 11; i++) {
           System.out.println(number + " X " + i + " = " + (number * i));
       }
    }

    static void tabuadaSimples2(){
        Scanner scn = new Scanner(System.in);
        System.out.println("-----Tabuada-----");
        System.out.println(" Informe um numero : ");
        int number = scn.nextInt();
        for (int i = 0 ; i < 11 ; i++){
            System.out.println(number + " X " + i + " = " + (number * i));
        }
        scn.close();
    }
}
