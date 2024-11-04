package br.com.fiap.sprint.dominio;

public class SistemaDeFreio {

    private String freio;
    private String freioDuro;
    private String freioBaixo;
    private String freioVibra;

    public SistemaDeFreio(String freio, String freioDuro, String freioBaixo, String freioVibra) {
        this.freio = freio;
        this.freioDuro = freioDuro;
        this.freioBaixo = freioBaixo;
        this.freioVibra = freioVibra;
    }

    public String getFreio() {
        return freio;
    }

    public void setFreio(String freio) {
        this.freio = freio;
    }

    public String getFreioDuro() {
        return freioDuro;
    }

    public void setFreioDuro(String freioDuro) {
        this.freioDuro = freioDuro;
    }

    public String getFreioBaixo() {
        return freioBaixo;
    }

    public void setFreioBaixo(String freioBaixo) {
        this.freioBaixo = freioBaixo;
    }

    public String getFreioVibra() {
        return freioVibra;
    }

    public void setFreioVibra(String freioVibra) {
        this.freioVibra = freioVibra;
    }
}
