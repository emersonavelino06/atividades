package lab2;

public class Descanso {  // criaçao da classe descanso
    private int horasDescanso; // atributos da classe descanso
    private int numeroSemanas;
    private boolean descansado;

    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
        this.descansado = false;
    }


    public void defineHorasDescanso(int valor)  {
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    public String getStatusGeral() {
        if (this.numeroSemanas == 0) {
            return "nao descansado";
        }

        int media = this.horasDescanso / this.numeroSemanas;

        if (media >= 26) {
            return "descansado";
        } else {
            return "nao descansado";
        }

        }

    }


