/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicoenclase;
import paquete1.Operacion2;
import java.util.Scanner;

/**
 *
 * @author Ricardo Freire
 */
         
public class SeleccionAnidada {

    public static void main(String[] args) {
        // 
        //declaramos las variables con el otro paquete
        String mensaje3 = Operacion2.mensaje3;
        String mensaje4 = Operacion2.mensaje4;   
            Scanner entrada=new Scanner(System.in); // ponermos una entrada
        int calificacion ; // declaramos una variable
        System.out.printf("Ingrese la calificacion\n");
        calificacion = entrada.nextInt(); // ingreso por teclado

        if (calificacion >= 90) { // operaciones
            System.out.printf("%S (excelente) %d\n", mensaje3,
                    calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("%s (muy buena) %d\n",mensaje3, 
                        calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("%s (regular) %d\n", mensaje4
                            ,calificacion);

                } else {
                    System.out.printf("%s %d\n", mensaje4,
                            calificacion);
                }
            }
        }
    }
}