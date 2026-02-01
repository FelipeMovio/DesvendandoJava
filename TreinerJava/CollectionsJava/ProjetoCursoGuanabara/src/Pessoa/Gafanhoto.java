package Pessoa;

import Video.Video;

public class Gafanhoto extends Pessoa {
    private String login;
    private Integer totalAssistido;

    public Gafanhoto(String nome, String sexo, Integer idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totalAssistido = 0;
    }

    public void viuMaisUM(){
        this.setTotalAssistido(getTotalAssistido() + 1);
        this.setExperencia(getExperencia() + 1);

    }

    public String Login() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(Integer totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totalAssistido=" + totalAssistido +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experencia=" + experencia +
                '}';
    }
}
