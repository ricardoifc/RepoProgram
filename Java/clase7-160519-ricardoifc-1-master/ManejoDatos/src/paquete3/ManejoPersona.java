/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author Ricardo Freire
 */
public class ManejoPersona {
    
    public static int obtenerEdad(int e){
        int edad = 2019 - e;
        return edad; 
    }
    public static int obtenerNotas(double a,double b){
        double promedio = a + b / 2;
        return (int) promedio;
        
    }
    
}
