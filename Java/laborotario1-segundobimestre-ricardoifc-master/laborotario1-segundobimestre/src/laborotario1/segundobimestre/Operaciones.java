/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborotario1.segundobimestre;

/**
 *
 * @author ricardoifc
 */
public class Operaciones {
    // creamos un public static string el cual recibiremos de principal
    public static String obtenerNotaCuantitativa(String estudiante, int notas){
        String calificacion;
        String notaCualitativa = ""; // aqui guardaremos el string
        if(notas <=34){ // comprobaremos la nota y le asignamos el string
            calificacion = "Regular"; 
        }else{
            if(notas>=35 && notas <=50){ 
                calificacion = "Buena";
            }else{
                calificacion = "Muy buena";
                }
        }
        // finalmente le damos formato a nuestro string que va a Principal
        notaCualitativa = String.format("%s   %d   %s",estudiante,notas,
                calificacion);
        return notaCualitativa;
    }
    
    public static double obtenerPromedioParalelo(int notas[]){
        // creamos unas variables
        double suma = 0;
        double promedio = 0;
        // aqui sumaremos las notas
        for (int c = 0; c < notas.length ; c++){
        suma = suma + notas[c];
        } // y finalmente las dividimos para el tamaño del array
        promedio = suma / notas.length;
    return promedio;
    }
}
