package ClassesUteis.Generics;

public class Shuriken {
    private int tamanho;


    //Contrutor
    public Shuriken(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Shuriken de tamanho :" + tamanho;
    }
}
