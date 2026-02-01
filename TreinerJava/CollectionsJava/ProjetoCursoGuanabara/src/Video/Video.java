package Video;

public class Video implements AcoesVideo{
    private String titulo;
    private Integer avaliacao;
    private Integer views;
    private Integer curtidas;
    private boolean reproduzindo;

    public Video() {
    }

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    @Override
    public void play() {
        this.setReproduzindo(true);
        System.out.println("reproduzindo");
    }

    @Override
    public void pause(){
        if(this.getReproduzindo()){
            this.setReproduzindo(false);
            System.out.println("pausado");
        } else {
            System.out.println("Video nem começou a reproduzir ainda!");
        }


    }

    @Override
    public void like(){
        this.setCurtidas(getCurtidas() + 1);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
