/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa;

import java.util.Formatter;


/**
 *
 * @author Ricardo Freire,Santiago Garcia
 */
public class Archivo {
    
    public static void crearRegistro(String cadenaN,String cadena){
        try{
            String rutaArchivo = String.format("Jugadores/%s.txt",cadenaN);
            Formatter salida = new Formatter(rutaArchivo);
            salida.format("%s\n",cadenaN);
            salida.close();
            
        }catch (Exception e){
            System.err.print("Error al crear el archivo.");
            System.exit(1);
        }
    }
}
