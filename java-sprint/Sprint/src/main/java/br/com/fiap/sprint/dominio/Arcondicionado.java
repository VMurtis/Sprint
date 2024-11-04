package br.com.fiap.sprint.dominio;


import java.util.Scanner;

/*https://autopapo.uol.com.br/noticia/ar-condicionado-do-carro-10-defeitos/*/

public class Arcondicionado {
    public Arcondicionado(String trocaDeFiltroApos20MilKm, String aumentoConsumoCombustivel, String naoGelaEFazsonAssobio) {
        this.trocaDeFiltroApos20MilKm = trocaDeFiltroApos20MilKm;
        this.aumentoConsumoCombustivel = aumentoConsumoCombustivel;
        this.naoGelaEFazsonAssobio = naoGelaEFazsonAssobio;

    }

    private String trocaDeFiltroApos20MilKm;
    private String aumentoConsumoCombustivel;

    private String naoGelaEFazsonAssobio;

    public String getNaoGelaEFazsonAssobio() {
        return naoGelaEFazsonAssobio;
    }

    public void setNaoGelaEFazsonAssobio(String naoGelaEFazsonAssobio) {
        this.naoGelaEFazsonAssobio = naoGelaEFazsonAssobio;
    }

    public String getAumentoConsumoCombustivel() {
        return aumentoConsumoCombustivel;
    }

    public void setAumentoConsumoCombustivel(String aumentoConsumoCombustivel) {
        this.aumentoConsumoCombustivel = aumentoConsumoCombustivel;
    }

    public String getTrocaDeFiltroApos20MilKm() {
        return trocaDeFiltroApos20MilKm;
    }

    public void setTrocaDeFiltroApos20MilKm(String trocaDeFiltroApos20MilKm) {
        this.trocaDeFiltroApos20MilKm = trocaDeFiltroApos20MilKm;
    }
}