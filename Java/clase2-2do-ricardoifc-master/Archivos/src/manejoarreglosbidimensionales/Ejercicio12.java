/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;

import java.util.Arrays;

/**
 *
 * @author reroes
 */
public class Ejercicio12 {

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
            
            for(int columna=0; columna<arreglo[fila].length; columna++){
                int valor = arreglo[fila][columna];
                switch(columna){
                    case 0:
                        suma1 = suma1 + valor;
                        break;
                    case 1:
                        suma2 = suma2 + valor;
                        break;
                    case 2:
                        suma3 = suma3 + valor;
                        break;
                }
                // System.out.printf("%d\t", arreglo[fila][columna]);
            }
            
                       
        }
        
        System.out.printf("Suma1 %d\n", suma1);
        System.out.printf("Suma2 %d\n", suma2);
        System.out.printf("Suma3 %d\n", suma3);
        
        
        
        
    }
    
}
