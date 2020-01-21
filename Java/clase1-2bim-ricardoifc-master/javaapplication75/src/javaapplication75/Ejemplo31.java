/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random(); // no lo uso
        
        
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20", 
            "20,1-adelante"}; // poner cada array asignando
        // declaramos variables para cada caso 
        int[] datos = new int[5]; // creo un array para 4 posiciones
        double notas;
        String opcion= "";
        boolean bandera = true;
        
        while(bandera == true){
            System.out.println("Ingrese la nota"); // ingreso por teclado
            notas = entrada.nextDouble();
            // uso if para comparar segun la nota sea mayor o menor asigno +1
            if(notas <=8){ // comparo notas que no sea mayor a 8
                datos[0] = datos[0] + 1; 
                // en caso de ser correcto asigno en el array
            }else{
                if(notas>=8.1 && notas <=12){ // igual que el anterior
                 datos[1] = datos[1] + 1;
                }else{
                    if(notas>=12.1 && notas <=16){
                        datos[2] = datos[2] + 1;
                    }else{
                        if(notas>=16.1 && notas <=19){
                            datos[3] = datos[3] + 1;
                        }else{
                            if(notas>=8.1 && notas <=12){
                                datos[4] = datos[4] + 1;
                            }else{
                                datos[5] = datos[5] + 1;
                                // en caso de ser mayor se asigna dato 5 = +1
                            }
                        }
                    }
                }
            }
        System.out.println("¿Desea continuar?(si/no)"); // para salir de boolean
        opcion = entrada.next(); // la opcion para salir 
        if (opcion.equals("no")){
                bandera = false; // si es verdadera salgo del ciclo
            }
        }

        System.out.println("Resultados"); // muestro resultado
        for(int i = 0; i<datos.length; i++){
            // con un contador muestro todos los array
            System.out.printf("Ventas en %s - %d\n", rangos[i], datos[i]);
    }
        


    }
}
