/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

/**
 *
 * @author reroes
 */
public class ArregloSiete {
    
    public static void main(String[] args) {
        
        double [] calificaciones_progr = {18, 19, 15, 16, 17, 10};
        double [] calificaciones_bd = {10, 12, 13, 20, 17, 20};
        double [] promedios = new double[6];
        
        for(int contador=0; contador<calificaciones_bd.length; contador++){
            double suma = calificaciones_progr[contador] + calificaciones_bd[contador];
            double promedio = suma/2; // se usa la variable ...
            // System.out.printf("Estudiante %d\t%f\%f\%f", contador,);
            promedios[contador] = promedio;
        }
        
        
    }
    
}
