package br.com.fiap.sprint.dominio;

public class Automovel {

    private String marcaCarro;
    private String modeloCarro;
    private String corCarro;
    private String placaCarro;
    private int anoCarro;

    public Automovel(String marcaCarro, String modeloCarro, String corCarro, String placaCarro, int anoCarro) {
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.corCarro = corCarro;
        this.placaCarro = placaCarro;
        this.anoCarro = anoCarro;
    }

    public Automovel() {

    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public int getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(String anoCarro) {
        this.anoCarro = Integer.parseInt(anoCarro);
    }

    public boolean validarMarca(String marcaCarro) {
        if (marcaCarro.length() < 2 ||marcaCarro == null || marcaCarro.isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean validarModelo(String modelo) {
        if (modeloCarro.length() < 2 ||modeloCarro == null || modeloCarro.isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean validarCor(String corCarro) {
        if (corCarro.length() < 2 ||corCarro == null || corCarro.isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean validarPlaca(String placaCarro) {
        if (placaCarro.length() < 2 ||placaCarro == null || placaCarro.isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean validarAno(int anoCarro) {
        if (anoCarro < 1900) {
            return false;
        }

        return true;
    }
}
