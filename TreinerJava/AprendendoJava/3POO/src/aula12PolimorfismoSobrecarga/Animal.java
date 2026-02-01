package aula12PolimorfismoSobrecarga;

public abstract class Animal {
    protected double peso;
    protected int idade;
    protected int mebros;


    public abstract void emitirSom();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMebros() {
        return mebros;
    }

    public void setMebros(int mebros) {
        this.mebros = mebros;
    }
}
