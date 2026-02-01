package aula12PolimorfismoSobreposicao;

public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolha(){
        System.out.println("respirando");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("nadando");

    }

    @Override
    public void alimentar() {
        System.out.println("comendo subetancias");

    }

    @Override
    public void emitirSom() {
        System.out.println("peixe nao tem som ");

    }
}
