package lab2;

public class Descanso {  // criaçao da classe descanso
    private int horasDescanso; // atributos da classe descanso
    private int numeroSemanas;
    private boolean descansado;

    public Descanso() { // o construtor, tem o mesmo nome da classe
    }
    public void DefineHorasDescanso(int valor) { // metodos presentes no codigo
        horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        numeroSemanas = valor;
    }

    public String getStatusGeral() {
        return "";
    }
}
