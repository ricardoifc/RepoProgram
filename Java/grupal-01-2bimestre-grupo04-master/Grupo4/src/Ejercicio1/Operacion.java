/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Ricardo Freire
 */
public class Operacion {
    public static int obtenerNumero(int arreglo[][]){ // obtengo el arreglo
        int suma = 0;
        int columna;
        int fila;
        // se cream ciclos para sumar todo el arreglo
        for (fila = 0; fila < arreglo.length; fila++) {
            for(columna=0; columna < arreglo[fila].length; columna++ ){
                suma = suma + arreglo[fila][columna]; 
                // se suman cada una de las filas con las columnas del arreglo
            }
        }
        
        return suma;
        
    }
    
}
