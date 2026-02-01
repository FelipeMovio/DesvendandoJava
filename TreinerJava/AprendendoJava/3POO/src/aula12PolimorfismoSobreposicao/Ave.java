package aula12PolimorfismoSobreposicao;

public class Ave extends Animal{
    private String corPena;

    public void fazerNinho(){
        System.out.println("fazendo sua casa");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("voando");


    }

    @Override
    public void alimentar() {
        System.out.println("comendo alpiste");


    }

    @Override
    public void emitirSom() {
        System.out.println("som de passaro");
    }
}
