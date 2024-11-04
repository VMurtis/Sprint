package br.com.fiap.sprint.dominio;

public class Alinhamento {

    private String tipoCombustao;

    public Alinhamento(String tipoCombustao) {
        this.tipoCombustao = tipoCombustao;
    }

    public String getTipoCombustao() {
        return tipoCombustao;
    }

    public void setTipoCombustao(String tipoCombustao) {
        this.tipoCombustao = tipoCombustao;
    }

}
