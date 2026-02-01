package firstWeek.day6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> person = new ArrayList<>();
        person.add(new Pessoa("Felipe","masculino",22, 1.80F));
        person.add(new Pessoa("davi","masculino",22, 1.83F));
        person.add(new Pessoa("Rodrigo","masculino",22, 1.67F));
        person.add(new Pessoa("Maicon","masculino",22, 1.90F));
        System.out.println(person);
    }
}
