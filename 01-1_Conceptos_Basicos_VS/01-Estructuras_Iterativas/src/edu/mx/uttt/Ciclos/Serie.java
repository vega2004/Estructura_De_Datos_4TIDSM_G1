package edu.mx.uttt.Ciclos;

public class Serie {
    // Variable de instancia
    private int n;

    public Serie() {
        this.n = 1;
    }

    public Serie(int n) {

        this.n = (n <= 0) ? 1 : n;
        // if(n < 0){
        // this.n = n;
        // } else{
        // this.n = 1;
        // }
    }

    // Metodo accesor
    public int getN() {
        return n;
    }

    // Metodo mutador
    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }

    public double calcularFor() {
        double r = 0.0;
        double constante = 1.0;
        for (int i = 1; i <= this.n; i++) {
            r += constante / i;
        }
        return r;
    }

    public double calcularWhile() {
        int i = 1;
        double constante = 1.0;
        double r = 0.0;
        while (i <= this.n) {
            r += constante / i;
            i++;
        }
        return r;
    }

    public double calcularDoWhile() {

        int i = 1;
        double r = 0.0;
        double constante = 1.0;
        do {
            r += (constante / i);
            i++;
        } while (i <= this.n);

        return r;
    }

    @Override
    public String toString() {
        return "Serie [n=" + n + "]";
    }

}
