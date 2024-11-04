package br.com.fiap.sprint.dominio;

public class Embreagem {

    private String embreagem;
    private String embreagemTrepida;
    private String embreagemMarcha;

    public Embreagem(String embreagem, String embreagemTrepida, String embreagemMarcha) {
        this.embreagem = embreagem;
        this.embreagemTrepida = embreagemTrepida;
        this.embreagemMarcha = embreagemMarcha;
    }

    public String getEmbreagem() {
        return embreagem;
    }

    public void setEmbreagem(String embreagem) {
        this.embreagem = embreagem;
    }

    public String getEmbreagemTrepida() {
        return embreagemTrepida;
    }

    public void setEmbreagemTrepida(String embreagemTrepida) {
        this.embreagemTrepida = embreagemTrepida;
    }

    public String getEmbreagemMarcha() {
        return embreagemMarcha;
    }

    public void setEmbreagemMarcha(String embreagemMarcha) {
        this.embreagemMarcha = embreagemMarcha;
    }
}
