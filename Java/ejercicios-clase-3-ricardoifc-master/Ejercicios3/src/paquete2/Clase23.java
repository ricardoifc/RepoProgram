/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Clase23 {
    
    public static void main(String[] args) {
        // uso de cast
        
        int valor1 = 10;
        String cadena = "10.293";
        String edad = "20";
        
        double variable3 = (double)(valor1);
        System.out.printf("%.2f\n", variable3);
        
        double variable4 = Double.parseDouble(cadena);
        System.out.printf("%.2f\n", variable4);
        
        int miEdad = Integer.parseInt(edad);
        System.out.printf("%d\n", miEdad);

        // System.out.printf("%.2f\n", Double.parseDouble(cadena));
    }
    
}
