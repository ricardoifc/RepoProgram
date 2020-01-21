/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author daniel
 */
public class Operacion {
    // Crearmos metodo que devuelve el promedio de 4 numeros
    public static double getPromedio(int [] notas){
        int sumaTotal = 0;
        
        for(int contador = 0; contador < notas.length; contador++){
            sumaTotal += notas[contador];
        }
        return sumaTotal / notas.length;
    }
    public static double getPromedio(int nota1, int nota2, int nota3, int nota4){
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    // Crearmos metodo que imprima el reporte
    public static void setImprimeReporte(String [] nombreEstudiantes, int [][] notas){
        String cadena = "Libreta General de calificaciones:\n\n";

        // Recorremos el array estudiantes
        for (int contador = 0; contador < nombreEstudiantes.length; contador++){
            cadena = String.format("%s\n\nEstudiante :%d: %s\n", cadena, (contador + 1), nombreEstudiantes[contador]);
            cadena = String.format("%sNotas: ", cadena);
            
            for(int contNotas = 0; contNotas < 4; contNotas++){
                cadena = String.format("%s%d, ", cadena, notas[contador][contNotas]);
            }
            cadena = String.format("%s\nPromedio: ", cadena);
            cadena = String.format("%s%f ", cadena, getPromedio(notas[contador][0], notas[contador][1], notas[contador][2], notas[contador][3]));
        }
        
        System.out.print(cadena);
    }
    
}
