import Pessoa.Gafanhoto;
import Video.Video;

public final class Visualizacao {
    private Gafanhoto espectador;
    private Video video;


    public Visualizacao() {
    }

    public Visualizacao(Gafanhoto espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.viuMaisUM();
        this.video.setViews(this.video.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Visualizacao : " +
                "espectador = " + espectador +
                ", video = " + video ;
    }
}
