package lab2;

public class RegistroResumos {
    private Resumo[] totalResumos;
    private int numeroDeResumos;
    private int quantidadeAtual;


    public  RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.totalResumos = new Resumo[numeroDeResumos];
        this.quantidadeAtual = 0;
    }

    public void adiciona(String tema, String conteudo) {
        if (this.quantidadeAtual < this.numeroDeResumos) {
            this.totalResumos[this.quantidadeAtual] = new Resumo(tema, conteudo);
            this.quantidadeAtual++;
        }
    }

    public String[] pegaResumos() {
        String[] temas = new String[this.quantidadeAtual];
        for (int i = 0; i < this.quantidadeAtual; i++) {
            temas[i] = this.totalResumos[i].getTema();
        }
        return temas;
    }

    public String imprimeResumos() {
        String resultado = "";
        for (int i = 0; i < this.quantidadeAtual; i++) {
            resultado += this.totalResumos[i].getTema();
            if (i < this.quantidadeAtual -1) {
                resultado += " | ";
            }
        }
        return resultado;
    }

    public int conta() {
        return this.quantidadeAtual;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (this.totalResumos[i].getTema().equalsIgnoreCase(tema)) {

            }
        }
        return false;
    }


}






