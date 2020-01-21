/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EstructuraArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> listaAlumnos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String nombres;
        int dato;
        boolean bandera = true;
        
        while(bandera==true){
            System.out.println("Ingrese el nombre del estudiante");
            nombres = entrada.nextLine();
            listaAlumnos.add(nombres);
            System.out.printf("%s", "Desea ingresar más valores use el número 2"
                    + " para terminar el proceso");
            dato = entrada.nextInt();
            if (dato==2) {
                bandera = false;
            }
            entrada.nextLine();
            
        }
        
        // leer los datos guardados
        
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.printf("%s\n", listaAlumnos.get(i));
        }

    }
}
