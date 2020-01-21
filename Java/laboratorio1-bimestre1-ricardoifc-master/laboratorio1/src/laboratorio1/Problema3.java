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
public class Problema3 {
   public static void main(String[] args) {
       // declaro variables
       int nota1,nota2,nota3;
       double promedio;
       // ingreso por teclado
       Scanner entrada = new Scanner(System.in);
       System.out.println("Por favor ingrese la nota 1");
       nota1 = entrada.nextInt();
       System.out.println("Por favor ingrese la nota 2");
       nota2 = entrada.nextInt();
       System.out.println("Por favor ingrese la nota 3");
       nota3 = entrada.nextInt();
       promedio = (nota1 + nota2 + nota3)/3;
       String resultado = promedio <= 14 ? "Paso el año" : "Perdio el año";
       System.out.printf("Promedio: %s\nUsted %s", promedio,resultado);
}}
