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
public class Clase24 {
    
    public static void main(String[] args) {
        //  System.out.printf("String is '%5s'\n", "A");
        
        String cadena = "Loja ciudad de Ecuador";
        
        System.out.printf("ciudad: %.5s\n", cadena);
        
        System.out.printf("ciudad: %15s\n", cadena);
        
        System.out.printf("%2$s - %1$s", cadena, "demo");
        
        
    }
    
}
