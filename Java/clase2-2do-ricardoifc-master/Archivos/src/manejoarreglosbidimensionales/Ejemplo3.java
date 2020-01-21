/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarreglosbidimensionales;

import java.util.Random;

/**
 *
 * @author reroes 
 *  0,0     0,1     0,2     0,3     0,4 
 *  1,0     1,1     1,2     1,3     1,4 
 *  2,0     2,1     2,2     2,3     2,4
 *  3,0     3,1     3,2     3,3     3,4 
 *  4,0     4,1     4,2     4,3     4,4
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] arreglo = new int[4][4];
        Random aleatorios = new Random();

        // Agregar valores al arreglo
        for (int fila = 0; fila < arreglo.length; fila++) {
            
            for(int columna=0; columna < arreglo[fila].length; columna++ ){
                arreglo[fila][columna] =  aleatorios.nextInt(100);
            }
        }
        
        // Presentar valores al arreglo
        for (int fila = 0; fila < arreglo.length; fila++) {
            
            for(int columna=0; columna < arreglo[fila].length; columna++ ){
                System.out.printf("%d\t", arreglo[fila][columna]);
                
            }
            System.out.println("");
        }
         System.out.println("-----------Valores inferiores a diagonal------------------");
        
        // Presentar valores de la diagonal
        boolean valor;
        for (int fila = 0; fila < arreglo.length; fila++) {
            
            for(int columna=0; columna < arreglo[fila].length; columna++ ){
                if(fila>columna){
                    valor = Operacion.determinarImpar(arreglo[fila][columna]);
                    if(valor==true){
                        System.out.printf("[%d][%d] = %d\t", fila, columna, 
                                arreglo[fila][columna]); 
                    }
                }
            }
            System.out.println("");
        }
        
        
    }

}
