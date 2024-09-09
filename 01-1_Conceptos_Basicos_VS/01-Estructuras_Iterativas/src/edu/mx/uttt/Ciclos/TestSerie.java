package edu.mx.uttt.Ciclos;

import javax.swing.JOptionPane;

public class TestSerie {
    public static void main(String[] args) {
        String resultado = "";

        Serie serie1 = new Serie();
        Serie serie2 = new Serie();

        resultado = "El resultado es: "
                + "\nEl valor de n es: " + serie1.getN()
                + "\nEl resultado de la serie utilizando el for: " + serie1.calcularFor()
                + "\nEl reultado de la serie utilizando el while: " + serie1.calcularWhile()
                + "\nEl resultado de la serie utilizando el do while es: " + serie1.calcularDoWhile()
                + "\nResultado con formato: " + serie1.toString() + "=" + serie1.calcularFor();

        JOptionPane.showMessageDialog(null, resultado);

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        serie2.setN(n);
        resultado = "El resultado es: "
                + "\nEl valor de n es: " + serie2.getN()
                + "\nEl resultado de la serie utilizando el for: " + serie2.calcularFor()
                + "\nEl reultado de la serie utilizando el while: " + serie2.calcularWhile()
                + "\nEl resultado de la serie utilizando el do while es: " + serie2.calcularDoWhile()
                + "\nResultado con formato: " + serie2.toString() + "=" + serie2.calcularFor();

        JOptionPane.showMessageDialog(null, resultado);

    }
}
