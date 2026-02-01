package aula6Encapsulamento;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Construtor
    public ControleRemoto() {
        this.volume = 50; // Volume inicial
        this.ligado = false; // Inicialmente desligado
        this.tocando = false; // Inicialmente não tocando
    }

    // status do controle remoto
    public void status() {
        System.out.println(" ---------- CONTROLE STATUS --------");
        System.out.println("Controle Remoto Status:");
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Tocando: " + this.getTocando());

    }

        public void ligar(){
        this.setLigado(true);

        };
        public void desligar(){
        this.setLigado(false);
        };

        public void fecharMenu(){
            System.out.println("Menu fechado.");
        };
        public void maisVolume(){
            if (this.getLigado()) {
                setVolume(getVolume() + 5);
            }else{
                System.out.println("Erro! Impossível aumentar volume com o controle desligado.");
            }

        };
        public void menosVolume(){
            if (this.getLigado()) {
                setVolume(getVolume() - 5);
            }else{
                System.out.println("Erro! Impossível diminuir volume com o controle desligado.");
            }

        };
        public void ligarMudo(){
            if (this.getLigado() && getVolume() > 0) {
                setVolume(0);
                System.out.println("Mudo ativado.");
            } else {
                System.out.println("Erro! Impossível ativar mudo com o controle desligado ou volume já em 0.");
            }

        };
        public void desligarMudo(){
        if (this.getLigado() && getVolume() == 0) {
                setVolume(50); // Volume padrão ao desligar mudo
                System.out.println("Mudo desativado. Volume ajustado para 50.");
            } else {
                System.out.println("Erro! Impossível desativar mudo com o controle desligado ou volume já ativo.");
            }

        };
        public void play(){
            if (this.getLigado() && !this.getTocando()) {
                this.setTocando(true);
                System.out.println("Reprodução iniciada.");
            } else if (!this.getLigado()) {
                System.out.println("Erro! Impossível reproduzir com o controle desligado.");
            } else {
                System.out.println("Erro! Já está tocando.");
            }
        };
        public void pause(){
            if (this.getLigado() && this.getTocando()) {
                this.setTocando(false);
                System.out.println("Reprodução pausada.");
            }

        };




    //Getters e Setters

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }
}

