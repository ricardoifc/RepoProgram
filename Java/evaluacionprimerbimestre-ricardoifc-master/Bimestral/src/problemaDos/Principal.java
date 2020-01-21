/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaDos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        int partidos;
        int goles;
        int sueldo;
        float total;
        String tipo;
        String opcion = "";
        String cadena = "";
        cadena = "Jugadores del Club UTPL\n\nNombre\t\tPartidos\tGoles\tSueldo\t"
                + "Bono\t\tTotal\t\tTipo\n";
        boolean bandera = true;
        
        while(bandera == true){
            System.out.println("Ingrese su nombre");
            nombre = sc.next();
            System.out.println("Ingrese su apellido");
            apellido = sc.next();
            System.out.println("Ingrese los partidos jugados");
            partidos = sc.nextInt();
            System.out.println("Ingrese los Goles");
            goles = sc.nextInt();
            System.out.println("Ingrese el sueldo");
            sueldo = sc.nextInt();
            float bono = ClaseLogica.obtenerBono(sueldo,goles);
            total = ClaseLogica.obtenerTotalSueldo(sueldo,bono);
            tipo = ClaseLogica.obtenerTipo(goles);
            
            cadena = String.format("%s%s %s\t%d\t\t%d\t%d\t%.2f\t%.2f\t%s\n",
                cadena,nombre,apellido,partidos,goles,sueldo,bono,total,tipo);
            System.out.println("¿Desea continuar? (si/no)");
            opcion = sc.next();
            
            if (opcion.equals("no")){
                bandera = false;
            }
        }
        System.out.printf("%s",cadena);
    } 
}
