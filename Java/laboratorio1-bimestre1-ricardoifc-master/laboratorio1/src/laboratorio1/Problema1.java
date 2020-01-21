/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.Scanner;

/**
 *
 * @author Ricardo Freire
 */
public class Problema1 {
    public static void main(String[] args) {
        // declaro variables
       int horas,costo;
       double resultado,descuento;
       // ingreso por teclado
       Scanner entrada = new Scanner(System.in);
       System.out.println("Por favor ingrese las horas trabajadas");
       horas = entrada.nextInt();
       System.out.println("Por favor ingrese el costo oficial");
       costo = entrada.nextInt();
       // las operaciones
       resultado = horas * costo;
       descuento = resultado * 0.10;
       // muestro en pantalla
       System.out.printf("Su sueldo es: %.2f \nEl descuento es:%.2f"
               ,resultado,descuento);
    }
}
