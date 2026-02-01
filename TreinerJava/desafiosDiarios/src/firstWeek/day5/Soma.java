package firstWeek.day5;

public class Soma {
    public void somar(int a,int b){
        int result = a + b;
        System.out.println(result);

    }
    public void subtrair(int a, int b){
        int result;
        if (a < b ){
            result = b - a;
        } else {
            result = a - b;
        }
        System.out.println(result);

    }
}
