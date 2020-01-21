/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejometodosuno;

/**
 *
 * @author reroes
 */
public class Operacion {
    
    public static int sumar(int a, int b){
        int suma = a + b;
        return suma;
    }
    
    public static int sumar(int b){
        int suma = 10 + b;
        return suma;
    }
    
    public static int sumar(String a, String b){
        int suma = Integer.parseInt(a) + Integer.parseInt(b);
        return suma;
    }
    
        
    public static int multiplicar(int a, int b){
        int multiplicacion = a * b;
        return multiplicacion;
    }
    
    
}
