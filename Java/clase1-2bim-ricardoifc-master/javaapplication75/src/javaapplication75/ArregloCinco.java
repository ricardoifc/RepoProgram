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
public class ArregloCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] c = {10, 20, 30, 40}; // declaramos la variable
        double operacion;
        //          0   1   2   3
        // lenght  es 4
      
        System.out.printf("%s\t\t%s\t\t%s\n", "Indice", "Valor","resultado");

        for (int contador = 0; contador < c.length; contador++) {
            operacion = (int) Math.pow(c[contador], 2);
            System.out.printf("%d\t\t%d\t\t%.0f\n", contador, c[contador],
                    operacion);
        }
    }

}
