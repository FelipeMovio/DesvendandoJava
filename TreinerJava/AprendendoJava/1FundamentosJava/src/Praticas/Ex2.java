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

class Ex2Case{
    public static void main(String[] args) {
        Integer mes = 10;

        switch (mes){
            case 1 :{
                System.out.println("janeiro");
                break;
            }
            case 2 :{
                System.out.println("fevereiro");
                break;
            }
            case 3 :{
                System.out.println("março");
                break;
            }
            case 4 :{
                System.out.println("abril");
                break;
            }
            case 5 :{
                System.out.println("maio");
                break;
            }
            case 6 :{
                System.out.println("junho");
                break;
            }
            case 7 :{
                System.out.println("julho");
                break;
            }
            case 8 :{
                System.out.println("agosto");
                break;
            }
            case 9 :{
                System.out.println("setembro");
                break;
            }
            case 10 :{
                System.out.println("outubro");
                break;
            }
            case 11 :{
                System.out.println("novembro");
                break;
            }
            case 12 :{
                System.out.println("dezembro");
                break;
            }
            default:
                System.out.println(" erro nenhum mes encontrado");
                break;
        }
    }
}
