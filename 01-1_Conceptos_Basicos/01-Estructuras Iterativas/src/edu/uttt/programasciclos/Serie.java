/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uttt.programasciclos;

/**
 *
 * @author Alexander Vega
 */
public class Serie {

    private int n;

    public Serie() {
        this.n = 1;
    }

    public int getN() {

        return n;
    }

    public void setN(int n) {
        //this.n = ((n > 0) ? n : 1);
        if (n > 0) {
            this.n = n;
        } else {
            this.n = 1;
        }
    }

    public double calcularSerieFor() {
        double suma = 0.0;
        double constante = 1.0;
        for (int i = 1; i <= this.n; i++) {
            suma += constante / i;

        }
        return suma;
    }

    public double calcularSerieWhile() {
        int i = 1;
        double constante = 1.0;
        double suma = 0.0;
        while (i <= this.n) {
            suma += constante / i;
            i++;
        }
        return suma;
    }

    public Serie(int n) {
        //this.n = ((n > 0) ? n : 1);
        if (n > 0) {
            this.n = n;
        } else {
            this.n = 1;
        }

    }

}
