/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete3.Potencia;

/**
 *
 * @author Salas
 */
public class Principal {
    public static void main(String[]arg){
        int arreglo [] = {10, 20, 30, 1, 2, 3, 40, 4};
        int arregloTamanio = TamArreglo.obtenerTamanioArreglo(arreglo 
                ,arreglo.length );
        System.out.printf("Metodo 1 Suma %d\n", arregloTamanio);
        
        int arregloTamanio2 = TamArreglo.obtenerTamanioArreglo2(arreglo 
                ,arreglo.length );
        System.out.printf("metodo 2 Suma %d\n", arregloTamanio2);
    }
}
