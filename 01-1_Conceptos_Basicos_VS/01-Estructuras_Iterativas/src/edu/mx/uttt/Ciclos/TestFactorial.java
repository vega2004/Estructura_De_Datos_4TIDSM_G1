package edu.mx.uttt.Ciclos;

import javax.swing.JOptionPane;

public class TestFactorial {
    public static void main(String[] args) {
        String resultadoF = "";

        Factorial factorial = new Factorial();

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        factorial.setN(n);
        resultadoF = "El resultado es: "
                + "\nEl valor de n es: " + factorial.getN()
                + "\nEl resultado de la serie utilizando el for: " + factorial.calcularFactorialFor()
                + "\nEl resultado de la serie utilizando el for: " + factorial.calcularFactorialForReverso()
                + "\nEl reultado de la serie utilizando el while: " + factorial.calcularFactorialWhile()
                + "\nEl resultado de la serie utilizando el do while es: " + factorial.calcularFactorialDoWhile()
                + "\nResultado con formato: " + factorial.toString() + "=" + factorial.calcularFactorialFor();
   
                JOptionPane.showMessageDialog(null, resultadoF);
            }
}
