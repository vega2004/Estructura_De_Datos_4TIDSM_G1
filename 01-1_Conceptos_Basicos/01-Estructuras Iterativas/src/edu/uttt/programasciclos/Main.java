package edu.uttt.programasciclos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        Serie serie1 = new Serie();

        serie1.setN(n);

        JOptionPane.showMessageDialog(null, "El resultado de la serie es: " + serie1.calcularSerieFor());
        JOptionPane.showMessageDialog(null,"El resultado de la serie es: " + serie1.calcularSerieWhile());
    }
}
