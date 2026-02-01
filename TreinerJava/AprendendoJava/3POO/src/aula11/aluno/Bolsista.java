package aula11.aluno;

public final class Bolsista extends Aluno{
    private int bolsa;

    public final void renovarBolsa(){
        System.out.println("Bolsa de estudos do " + this.getNome() + " renovada");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento com desconto ");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
