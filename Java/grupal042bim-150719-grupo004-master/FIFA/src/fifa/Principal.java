/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ricardo Freire, Santiago Garcia
 */
public class Principal {
    public static void main(String[] args){
        
        try{
        String cadenaN= "";
        String cadena ="";
        Scanner entrada = new Scanner(new File("arhivo-grupal-04.txt"));
        String name, display, country, lName, fName, shirt, dob, pos, club,
                height, caps, goals;
        while (entrada.hasNext()){
            String linea = entrada.nextLine();
            ArrayList<String> linea_partes = new ArrayList<>(
                    Arrays.asList(linea.split("\\|")));
            cadenaN = (linea_partes.get(1));
            name = (linea_partes.get(1));
            display = (linea_partes.get(2));
            country = (linea_partes.get(3));
            lName = (linea_partes.get(4));
            fName = (linea_partes.get(5));
            shirt = (linea_partes.get(6));
            dob = (linea_partes.get(7));
            pos = (linea_partes.get(8));
            club = (linea_partes.get(9));
            height = (linea_partes.get(10));
            caps = (linea_partes.get(11));
            goals = (linea_partes.get(12));
            
            
            System.out.println(name);
            Archivo.crearRegistro(cadenaN, cadena);
            
        }
        }
        catch (Exception e){
            System.err.print("Error al leer el archivo.");
            System.exit(1);}
        }
    }
    //public static void leerRegistro(){
        
//}

