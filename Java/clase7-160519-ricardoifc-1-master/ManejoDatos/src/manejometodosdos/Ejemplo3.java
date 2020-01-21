/*
permita ingresar Un valor entero entre mayor a 1 y 7 y menor y utilizar un 
metodo que me permita retornar el nombre del dia de la semana en funcion de el 
valor ingresadpo
 */
package manejometodosdos;

import java.util.Scanner;

/**
 *
 * @author Ricardo Freire
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero del dia");
        String miDia = "";
        int valor = sc.nextInt();
        
        if ((valor >=1) & (valor <=7)){
            miDia = obtenerDia(valor);
            System.out.printf("%s\n", miDia);
        }
        else{
            System.out.println("Error en valor ingresado");
        }
        
    } 
    public static String obtenerDia(int d){
        String dia = "";
        switch (d){
            case  1:
                dia = "Lunes";
            case 2:
                dia = "Martes";
            case 3:
                dia = "Miercoles";
            case 4:
                dia = "Jueves";
            case 5:
                dia = "Viernes";
            case 6:
                dia = "Sabado";
            case 7:
                dia = "Domingo";
        }
        return dia;
    }
}
