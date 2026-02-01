package aula7RelacacaoEntreClasses;

public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    //métodos públicos
    public void marcarLuta( Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta marcada entre " + l1.getNome() + " e " + l2.getNome());
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Luta não pode ser marcada.");
        }
    }
    public void Lutar(){
        if (this.getAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            // Lógica de luta
            double vitoria = Math.random();
            if (vitoria < 0.5) {
                this.getDesafiado().ganharLuta();
                this.getDesafiante().perderLuta();
            } else if (vitoria < 0.8) {
                this.getDesafiante().ganharLuta();
                this.getDesafiado().perderLuta();
            } else {
                this.getDesafiado().empatarLuta();
                this.getDesafiante().empatarLuta();
            }
        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
