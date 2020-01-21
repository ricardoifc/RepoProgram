/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.Scanner;

/**
 *
 * @author Ricardo Freire
 */
public class AtencionCanina {
public static void main(String[] args) {
    
String cedula ;
String nombre;
String raza;
String edad;
float peso;
float tarifa =0;

Scanner entrada = new Scanner(System.in);
System.out.println("----Atención Canina----\n");
System.out.println("Datos del propietario:");
System.out.println("Su Cedula:");
    cedula=entrada.next();
System.out.println("\nDatos del canino:");
System.out.println("Nombre de su perro:");
    nombre=entrada.next();
System.out.println("Raza de su perro:");
    raza=entrada.next();
System.out.println("Edad de su perro:");
    edad=entrada.next();
System.out.println("Peso de su perro:");
    peso=entrada.nextFloat();
    
if (peso <= 5){
    tarifa=55;}
else{
    if (peso >= 7 && peso <=16){
        tarifa=175;}
        else{
        if (peso >= 14.1 && peso <=40){
            tarifa=205;}
        else{
            if (peso <40){
                tarifa=325;}
}}}
System.out.printf("Datos del propietaro\n\tCedula: %s\nDatos del canino:\n\t"
        + "Nombre: %s\n\tRaza: %s\n\tEdad: %s\n\tPeso: %.1f\n\tTarifa semanal: "
        + "%.2$",cedula,nombre,raza,edad,peso,tarifa);
 System.out.printf("Owner's information\n\tIdentification card: %s\n"
         + "Canine data:\n\tName: %s\n\tRace: %s\n\tAge: %s\n\tWeight: %.1f\n\t"
         + "Weekly rate: %.2f$",cedula,nombre,raza,edad,peso,tarifa);
}