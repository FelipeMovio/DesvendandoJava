package aula12PolimorfismoSobrecarga;

public class Cachorro extends Lobo{

    public void reagir(String frase){
        if(frase.equals("toma cuidado") || frase.equals("Ola")){
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }

    }

    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar");
        } else if (hora >= 18){
            System.out.println("Ignorar");

        }else {
            System.out.println("Abanar e Latir");
        }

    }

    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar ");
        }else {
            System.out.println("Rosnar e Ignorar");
        }

    }

}
