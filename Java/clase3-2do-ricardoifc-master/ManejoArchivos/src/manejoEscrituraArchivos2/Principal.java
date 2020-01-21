/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoEscrituraArchivos2;
import java.util.Random;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]) {
        // declaro variables, un scanner y un random
        Scanner sc= new Scanner(System.in);
        Random aleatorios = new Random();
        boolean bandera = false;

        while(bandera == false){
            int numero = aleatorios.nextInt(10000); // el numero random
            System.out.println("Ingrese su nombre");
            String nombre = sc.nextLine();
            System.out.println("Ingrese sus apellidos");
            String apellido = sc.nextLine();
            System.out.println("Nombre de la institución");
            String institucion = sc.nextLine();
            System.out.println("¿Desea salir? (si/no)");
            String opcion = sc.nextLine(); // la opcion para bandera
            if(opcion.equals("si")){ // una bandera para salir o continuar
                bandera = true;
            }
            String cadena1 = String.format("%s%s%d", nombre, apellido, numero);
            String cadena2 = String.format("Nombre: %s\nApellidos:%s\n"
                    + "Institución: %s", nombre, apellido, institucion);
            CrearArchivo.agregarRegistros(cadena1, cadena2);

        }
}}
