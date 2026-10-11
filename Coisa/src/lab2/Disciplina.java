package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.nota4 = 0;
    }


    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        switch (nota) {
            case 1:
                this.nota1 = valorNota;
                break;
            case 2:
                this.nota2 = valorNota;
                break;
            case 3:
                this.nota3 = valorNota;
                break;
            case 4:
                this.nota4 = valorNota;
                break;
            default:
                break;
        }

    }

    public boolean aprovado() {
        return calculaMedia() >= 7.0;
    }


    // falta o to string
    public double calculaMedia() {
        return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4.0;
    }

    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() +
                " [" + (int)this.nota1 + ", " + (int)this.nota2 +  ", "  + (int)this.nota3 + ", " + (int)this.nota4 + "]";

    }

}
