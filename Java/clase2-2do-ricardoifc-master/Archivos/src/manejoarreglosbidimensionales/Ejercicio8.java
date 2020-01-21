/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarreglosbidimensionales;

import java.util.Arrays;

/**
 *
 * @author reroes
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] arreglo = new int[2][3];
        
        for(int fila=0; fila<arreglo.length; fila++){
            
            for(int columna=0; columna<arreglo[fila].length; columna++){
                System.out.printf("[%d,%d] valor==>%d\t", fila, columna, arreglo[fila][columna]);
            }    
            System.out.println("");
            
        }
        
        
        
        
    }
    
}
