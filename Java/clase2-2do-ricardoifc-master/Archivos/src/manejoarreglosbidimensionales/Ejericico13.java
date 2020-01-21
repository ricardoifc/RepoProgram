/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarreglosbidimensionales;

/**
 *
 * @author reroes
 */
public class Ejericico13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] arreglo = {{1, 2, 3}, {4, 6, 8}, {10, 20, 30}};

        for (int fila = 0; fila < arreglo.length; fila++) {
            int suma_fila = 0;
            for (int columna = 0; columna < arreglo[fila].length; columna++) {
                suma_fila = suma_fila + arreglo[fila][columna];
            }
            System.out.printf("%d\n", suma_fila);
        }

    }

}
