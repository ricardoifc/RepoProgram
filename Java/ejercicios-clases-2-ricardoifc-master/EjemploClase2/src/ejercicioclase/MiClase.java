/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author Ricardo Freire
 */
public class MiClase {
    
    /**
     * mi clase
     */
    public static void main(String[] args) {
        // 
        
        String nombre, apellido, ciudad, pais;
        int edad, nota1, nota2;
        double promedio;
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
        
        System.out.println("Por favor ingrese su Pais");
        pais = entrada.nextLine();
        
        System.out.println("Ingrese su primera nota");
        nota1 = entrada.nextInt();
        
        System.out.println("Ingrese su segunda nota");
        nota2 = entrada.nextInt();
        
        promedio = (nota1 + nota2)/2;
                
        System.out.printf("Sus nombres y apellidos es: %s %s\nEdad: %s\nCiudad:"
                + " %s\nPais: %s\nNotas: %s y %s \nPromedio: %s" 
                ,nombre,apellido,edad,ciudad,pais,nota1,nota2,promedio);
    }
}