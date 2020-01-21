/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejometodosdos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjecutaDos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int tabla ;
        
        int limite ;
        System.out.println("Ingrese la tabla");
        tabla = sc.nextInt();
        System.out.println("Ingrese limite");
        limite = sc.nextInt();
        obtenerTabla(tabla, limite);
        
        System.out.println("Imprimir en el método main");
        String miTabla = obtenerTablaAsCadena(tabla, limite);
        System.out.printf("%s", miTabla);
    }
    
    public static void obtenerTabla(int v, int c){
        String cadena = "";
        int operacion = 0;
        for (int i = 1; i <= c; i++) {
            operacion = v*i;
            cadena = String.format("%s%d*%d=%d\n", cadena, v, i, operacion);
        }
        System.out.printf("%s", cadena);
    }
    
    public static String obtenerTablaAsCadena(int v, int c){
        String cadena = "";
        int operacion = 0;
        for (int i = 1; i <= c; i++) {
            operacion = v*i;
            cadena = String.format("%s%d*%d=%d\n", cadena, v, i, operacion);
        }
        return cadena;
        
    }
    
}
