/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

/**
 *
 * @author reroes
 */
public class ArregloUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] c = new int[5]; // el 5 es el limite de array son 4 posiciones
        c[3] = 20;
        c[1 + 1] = 20;
        c[2] = 10;
        c[4] = 20;
        // arr1[5] = 20;
        // para que en el print de la suma 
        System.out.printf("%d + %d = %d\n", c[1],c[4],c[1] + c[4]);
        System.out.printf("El teamaño del arrelgo es: %d\n",c.length);
        // lenght es el numero de posiciones en leght
        
    }
    
}












