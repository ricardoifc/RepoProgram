/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.Scanner;

/**
 *
 * @author Ricardo Freire
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        int año;
        double nota1;
        double nota2;
        System.out.println("Ingrese su nombre");
        nombre = sc.next();   
        System.out.println("Ingrese su apellido");
        apellido = sc.next();  
        System.out.println("Ingrese su año de nacimiento");
        año = sc.nextInt();        
        System.out.println("Ingrese nota 1");
        nota1 = sc.nextDouble();
        System.out.println("Ingrese nota 2");
        nota2 = sc.nextDouble();
        int edad = ManejoPersona.obtenerEdad(año);
        float notas = ManejoPersona.obtenerNotas(nota1,nota2);
        
        System.out.printf("%s %s\n",nombre,apellido); 
        System.out.printf("Edad %d años\n", edad);
        System.out.printf("con notas %.1f y %.1f\n",nota1,nota2);
        System.out.printf("tiene promedio de %.2f",notas);
    }
}
