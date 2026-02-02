package Praticas;

public class Ex2{
    public static void main(String[] args) {
        Double nota1 = 5.;
        Double nota2 = 9.7;
        Double nota3 = 8.2;

        Double mediaSemFormatar = (nota1 + nota2 + nota3) / 3 ;
        String media =String.format("%.2f", mediaSemFormatar);

        if (mediaSemFormatar >= 7 ){
            System.out.println("Passou, sua media foi : " + media );
        } else if (mediaSemFormatar== 5){
            System.out.println("recuperção  sua media foi : " + media);
        } else {
            System.out.println("reprovado sua media foi : " + media );
        }
    }
}
