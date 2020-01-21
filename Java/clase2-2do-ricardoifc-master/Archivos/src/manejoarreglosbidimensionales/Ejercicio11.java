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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] arreglo = {{1,2,3}, {4,6,8}, {10,20,30}};
        
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        
        for(int fila=0; fila<arreglo.length; fila++){
            
            suma1 = suma1 + arreglo[fila][0];
            suma2 = suma2 + arreglo[fila][1];
            suma3 = suma3 + arreglo[fila][2];
            
                       
        }
        
        System.out.printf("Suma1 %d\n", suma1);
        System.out.printf("Suma2 %d\n", suma2);
        System.out.printf("Suma3 %d\n", suma3);
        
        
        
        
    }
    
}
