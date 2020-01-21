/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Ricardo Freire
 */
public class Principal {
    public static void main (String []args){
        // Declaracion e iniciazion de arrays
        String [] estudiantes ={"MASACHE RAMÓN ROYER JOSÉ",
                                "MEDINA OJEDA DANIEL MARCELO",
                                "MORALES QUEZADA DAVID RICARDO",
                                "NARVAEZ ROMAN MIGUEL ROBERTO"};

        int notas [][] = {
                {20, 19, 10, 13},
                {18, 19, 13, 20},
                {17, 16, 12, 18},
                {16, 15, 11, 15}};
        
        Operacion.setImprimeReporte(estudiantes, notas);
    }
}
