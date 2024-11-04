package br.com.fiap.sprint.dominio;

public class BalanceamentoGeometria {

    private String vibracaoEmAltaVelocidade;
    private String desgasteIrregularDosPneus;
    private String instabilidadeEmCurvas;

    public BalanceamentoGeometria(String vibracaoEmAltaVelocidade, String desgasteIrregularDosPneus, String instabilidadeEmCurvas) {
        this.vibracaoEmAltaVelocidade = vibracaoEmAltaVelocidade;
        this.desgasteIrregularDosPneus = desgasteIrregularDosPneus;
        this.instabilidadeEmCurvas = instabilidadeEmCurvas;
    }

    public String getVibracaoEmAltaVelocidade() {
        return vibracaoEmAltaVelocidade;
    }

    public void setVibracaoEmAltaVelocidade(String vibracaoEmAltaVelocidade) {
        this.vibracaoEmAltaVelocidade = vibracaoEmAltaVelocidade;
    }

    public String getDesgasteIrregularDosPneus() {
        return desgasteIrregularDosPneus;
    }

    public void setDesgasteIrregularDosPneus(String desgasteIrregularDosPneus) {
        this.desgasteIrregularDosPneus = desgasteIrregularDosPneus;
    }

    public String getInstabilidadeEmCurvas() {
        return instabilidadeEmCurvas;
    }

    public void setInstabilidadeEmCurvas(String instabilidadeEmCurvas) {
        this.instabilidadeEmCurvas = instabilidadeEmCurvas;
    }
}
