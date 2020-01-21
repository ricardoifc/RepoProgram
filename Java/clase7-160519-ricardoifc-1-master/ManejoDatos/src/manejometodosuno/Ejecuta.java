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
public class Ejecuta {
    public static void main(String[] args) {
        
        int valor1 = 10;
        int valor2 = 20;
        int suma = Operacion.sumar(valor1, valor2);
        System.out.printf("El valor de la suma es %d\n", suma);
        int suma2 = Operacion.sumar(valor1);
        System.out.printf("El valor es",suma2);
        int suma3 = Operacion.sumar(valor1,valor2);
        System.out.printf("El valor es",suma3);
    }
}
