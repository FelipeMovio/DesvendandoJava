package ClassesUteis.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja <T> {
    // Inicializando nosso Array
    private List<T> ferramentas;

    //Construtor
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    // Colocar ferramentas na nossa lista
    public void addFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    //MOstrar a nossa lista de ferramentas
    public void mostrarFerramenta(){
        for(T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }

}
