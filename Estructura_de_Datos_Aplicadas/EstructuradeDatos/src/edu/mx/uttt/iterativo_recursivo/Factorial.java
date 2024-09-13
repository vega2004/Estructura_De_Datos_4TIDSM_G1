package edu.mx.uttt.iterativo_recursivo;

import javax.swing.*;

public class Factorial {

    private int n;

    public Factorial(int n) {
        this.n = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }

    public long calcularIterativo(String opcion) {
        long resp = 0;
        switch (opcion) {
            case "1":
                resp = calcularFactorialFor();
                break;
            case "2":
                resp = calcularFactorialWhile();
                break;
            case "3":
                resp = calcularFactorialDoWhile();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
        return 0;
    }

    private long calcularFactorialFor() {
        long fact = 1;
        for (int i = 1; i <= this.n; i++) {
            fact *= i;
        }

        return fact;
    }

    private long calcularFactorialWhile() {
        long fact = 1;
        int i = 1;
        while (i <= this.n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    private long calcularFactorialDoWhile() {
        long fact = 1;
        int i = 1;

        do {
            fact *= i;
            i++;
        } while (i <= this.n);

        return fact;
    }

    public long calcularFactorialRecursivo(int n) {
        if (n == 1) {
            return 1;
        } else {
            return calcularFactorialRecursivo(n - 1) * n;
        }
    }
}
