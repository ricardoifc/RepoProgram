/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Salas
 */
public class Operacion {
    // creamos un public static string el cual recibiremos de principal
    public static String obtenerPromedioCuantitativo(double notas){
        String calificacion = "";  // aqui guardaremos la salida
        if(notas <=11){ // asignamos el promedio cuantitativo
            calificacion = "Regular"; 
        }else{
            if(notas>=11.1 && notas <=15.9){ 
                calificacion = "Bueno";
            }else{
                if(notas>=16 && notas <=18.9){ 
                    calificacion = "Muy Bueno";
                }else{
                    if(notas>=19 && notas <=20){ 
                        calificacion = "Sobresaliente";
                    }
                }
            }
        }
        // finalmente le damos formato a nuestro string que va a Principal
        return calificacion;
    }
}
