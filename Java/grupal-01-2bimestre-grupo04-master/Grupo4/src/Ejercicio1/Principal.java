/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Random;

/**
 *
 * @author Ricardo Freire
 */
public class Principal {
    public static void main(String[] args) {
        int [][] arreglo = new int[3][5]; // creo la matriz 3 filas y 5 columnas
        Random aleatorios = new Random(); // variable random
        int fila;
        int columna;
        int suma; // variable donde se obtendra la sum  a
        // se crean ciclos para sumar para dar numeros aleatorios al arreglo
        for (fila = 0; fila < arreglo.length; fila++) {
            for(columna=0; columna < arreglo[fila].length; columna++ ){
                arreglo[fila][columna] =  aleatorios.nextInt(999);
                // pongo numeros random en todo el arreglo bidimensional
            }
        }
        suma = Operacion.obtenerNumero(arreglo);
        // en clase Operacion, hago la suma de todos los numeros
        System.out.println(suma);
    }
    
}
