package br.com.fiap.sprint.dominio;

public class Correia {

    private String ruidoCorreia;
    private String partidaMotor;
    private String desgasteCorreia;

    public Correia(String ruidoCorreia, String partidaMotor, String desgasteCorreia) {
        this.ruidoCorreia = ruidoCorreia;
        this.partidaMotor = partidaMotor;
        this.desgasteCorreia = desgasteCorreia;
    }

    public String getRuidoCorreia() {
        return ruidoCorreia;
    }

    public void setRuidoCorreia(String ruidoCorreia) {
        this.ruidoCorreia = ruidoCorreia;
    }

    public String getPartidaMotor() {
        return partidaMotor;
    }

    public void setPartidaMotor(String partidaMotor) {
        this.partidaMotor = partidaMotor;
    }

    public String getDesgasteCorreia() {
        return desgasteCorreia;
    }

    public void setDesgasteCorreia(String desgasteCorreia) {
        this.desgasteCorreia = desgasteCorreia;
    }
}
