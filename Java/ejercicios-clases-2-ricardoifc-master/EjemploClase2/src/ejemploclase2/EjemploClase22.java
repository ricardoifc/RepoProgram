/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase2;

import java.util.Scanner;

/**
 *
 * @author Ricardo Freire
 */
public class EjemploClase22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este metodo es el principal de mi proyecto
        // No olvidar ingresar valores
        
        String nombre, apellido, ciudad;
        int edad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese su nombres");
        nombre = entrada.nextLine();
        
        System.out.println("Por favor ingrese su apellidos");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor ingrese su edad");
        edad = entrada.nextInt();
        
        entrada.nextLine(); // Limpieza buffer de entrada de datos
        
        System.out.println("Por favor ingrese su ciudad");
        ciudad = entrada.nextLine();
        
        System.out.println("Su nombre es: "+nombre+"\n\n\t Su apellido "
                +"es: "+apellido+", edad: "+edad+"\nCiudad: "+ciudad);
       
    } 
}
