package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestidoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoInvestidoOnline = 0;
        this.tempoEsperado = 120;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoInvestidoOnline = 0;
        this.tempoEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoInvestidoOnline += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        return this.tempoInvestidoOnline >= this.tempoEsperado;
    }

    public String toString() {
        return this.nomeDisciplina + " " + this.tempoInvestidoOnline + "/" + this.tempoEsperado;
    }

}
