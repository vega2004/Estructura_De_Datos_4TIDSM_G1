package edu.mx.uttt.Ciclos;

public class Factorial {
    private int n;

    public Factorial(){
        this.n = 1;
    }

    public Factorial(int n) {
        this.n = (n <= 0) ? 1 : n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }

    public double calcularFactorialFor() {
        int factorial = 1;
        for (int i = 1; i <= this.n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double calcularFactorialForReverso() {
        int factorial = 1;
        for (int i = this.n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public double calcularFactorialWhile() {
        int i = 1;
        int factorial = 1;
        while (i <= this.n) {
            factorial *= i;
            i++;
        }
        return factorial;
    }

    public double calcularFactorialDoWhile() {

        int i = 1;
        int factorial= 1;
        do {
            factorial *= i;
            i++;
        } while (i <= this.n);

        return factorial;
    }

    @Override
    public String toString() {
        return "Serie [n=" + n + "]";
    }


    
}
