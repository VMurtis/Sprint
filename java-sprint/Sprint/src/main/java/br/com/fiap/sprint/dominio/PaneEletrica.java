package br.com.fiap.sprint.dominio;

public class PaneEletrica {

    private String paneLigar;
    private String paneLuz;

    public PaneEletrica(String paneLigar, String paneLuz) {
        this.paneLigar = paneLigar;
        this.paneLuz = paneLuz;
    }

    public String getPaneLigar() {
        return paneLigar;
    }

    public void setPaneLigar(String paneLigar) {
        this.paneLigar = paneLigar;
    }

    public String getPaneLuz() {
        return paneLuz;
    }

    public void setPaneLuz(String paneLuz) {
        this.paneLuz = paneLuz;
    }
}
