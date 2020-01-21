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
public class Problema2 {
   public static void main(String[] args) {
       // declarar variables
        String xx,yy,zz;
        double m;
        // ingreso por teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese X");
        xx= entrada.nextLine();
        System.out.println("Ingrese Y");
        yy = entrada.nextLine(); 
        System.out.println("Ingrese Z");
        zz = entrada.nextLine(); 
        // Convertir de cadena a double
        double x = Double.parseDouble(xx);
        double y = Double.parseDouble(yy);
        double z = Double.parseDouble(zz);
        // la operacion
        m = x+(y/z)/x-(y/z);
        // presentar en pantalla
        System.out.printf("El valor de m, en base a las variables:\nx = %.1f\n"
                +"\ty = %.1f\n\t\tz = %.1f\nda como resultado:\n\tm = %.2f",x,y,z,m);
}}
