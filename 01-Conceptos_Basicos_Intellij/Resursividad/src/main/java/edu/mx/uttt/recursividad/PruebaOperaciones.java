package edu.mx.uttt.recursividad;
import javax.swing.JOptionPane;
public class PruebaOperaciones {
    public static void main(String[] args) {
        //ejecutar();
        Operaciones ope1 = new Operaciones();
        ope1.setN(3);
        ope1.imprimirNumeroRecursivo(ope1.getN());
    }

    public static String menu(){
    String menu = "Menu Princiapal\n" +
                    "1) Imprimir Iterativo\n" +
                    "2) Imprimir Recursivo\n" +
                    "3) Salir\n" +
                    "Elegir opcion:";


        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar(){
        String opcion ;
        boolean sentinel = true;
        Operaciones ope1 = new Operaciones();
        do{
            opcion = menu();
        switch(opcion){
            case "1": //Iterativo
                int n = 0;
                n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir: "));
                ope1.setN(n);
                ope1.imprimir();
                break;
            case "2":
                n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero de veces a Imprimir: "));
                ope1.setN(n);
                ope1.imprimir(ope1.getN());
                break;
            case "3":
                JOptionPane.showMessageDialog
                        (null,"I'll be back");
                sentinel = false;
                break;

            default:
                JOptionPane.showMessageDialog(null,"Opcion no valida");
        }

        }while(sentinel);
    }
}
