package Operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean a1 = true;
        boolean a2 = false;

        boolean and = a1 && a2;   // E
        boolean or = a1 || a2;    // Ou
        boolean not = !a1;        // Não

        System.out.println("AND: " + and);
        System.out.println("OR: " + or);
        System.out.println("NOT: " + not);

    }
}
