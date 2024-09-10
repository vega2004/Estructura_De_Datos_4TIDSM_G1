package edu.mx.uttt.recursividad;

public class Operaciones {
    private int n;


    public Operaciones(){
        this.n = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {

        this.n = (n>0) ? n:1;
    }

    public void imprimir(){
        int i = 1;
        do{
            System.out.println("Hola Mundo");
            i++;
        }while(i <= this.n);
    }

    public void imprimir(int n){

        //Caso Base
        if(n == 1){
                System.out.println("Hola Mundo");
            } else{
            //Caso General
                System.out.println("Hola Mundo");
                imprimir(n - 1);
            }
    }
}
