package br.com.fiap.sprint.dominio;

public class Superaquecimento {

    private String nivelDeAgua;
    private String mangueirasInternas;

    public Superaquecimento(String nivelDeAgua, String mangueirasInternas) {
        this.nivelDeAgua = nivelDeAgua;
        this.mangueirasInternas = mangueirasInternas;
    }

    public String getNivelDeAgua() {
        return nivelDeAgua;
    }

    public void setNivelDeAgua(String nivelDeAgua) {
        this.nivelDeAgua = nivelDeAgua;
    }

    public String getMangueirasInternas() {
        return mangueirasInternas;
    }

    public void setMangueirasInternas(String mangueirasInternas) {
        this.mangueirasInternas = mangueirasInternas;
    }
}
