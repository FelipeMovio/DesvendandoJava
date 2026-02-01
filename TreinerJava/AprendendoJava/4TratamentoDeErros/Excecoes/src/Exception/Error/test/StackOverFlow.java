package Exception.Error.test;

public class StackOverFlow {
    public static void main(String[] args) {
        recursividade();
    }

     public static void recursividade(){
        recursividade();
     }
}
