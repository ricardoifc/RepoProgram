/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarreglosbidimensionales;

/**
 *
 * @author Ricardo Freire
 */
public class Operacion {
    public static boolean determinarImpar(int v){
        boolean impar = true;
        if(v % 2 == 0){
            impar = false;
        }
        return impar;
    }
}
