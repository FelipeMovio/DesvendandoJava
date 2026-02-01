package aula12PolimorfismoSobreposicao;

public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("rastejando");

    }

    @Override
    public void alimentar() {
        System.out.println("come frutas ");

    }

    @Override
    public void emitirSom() {
        System.out.println("emitindo som de reptil");

    }
}
