/*
Estructuras2
 */
package estructuras2;

import java.util.Scanner;

/**
 @author Ricardo Freire
 */
public class Ciclos4 {
    public static void main(String[] args) {
        // el encabezado de la instrucción for incluye la inicilializacion,
        // la condición de continuacion de ciclo y el incremento
        Scanner entrada = new Scanner (System.in);
        String cadena = "";
        int limite1;
        int limite2;
        int operacion = 0; // atención
        String cadenaTmp = ""; // cadena demporal
        String operador = "";
        int opcion;
        String tipoOperador = "";
        
        System.out.println("Seleccione 1(Suma) | 2(resta) | 3(multiplicacion "
                + "| 4(dividir))"); // pedimos que tipo de operacion es
        opcion = entrada.nextInt();
        System.out.println("Limite de operador 1"); // limite de operador 1
        limite1 = entrada.nextInt();
        System.out.println("Limite de operador 2"); // limite de operador 2
        limite2 = entrada.nextInt();
        
        if (opcion == 1){ // suma
            operador = "Tablas de sumar";
            tipoOperador = "+";
        }else{
            if (opcion == 2){ // resta
                operador = "Tablas de restar";
                tipoOperador = "-";
            }else{
                if (opcion == 3){ // multiplicacion
                    operador = "Tablas de multiplicar";    
                    tipoOperador = "*";
                }else{
                    if (opcion == 4){ // divicion
                        operador = "Tablas de dividir";
                        tipoOperador = "/";
                    }
                }}
        }
    if (opcion ==1 | opcion == 2 | opcion == 3 | opcion == 4){ // opcion hasta 4
        cadena = String.format("%s%s\n",cadena,operador);        
        // primer for
        for (int contador=2; contador <= limite1; contador++) { 
            cadena = String.format("%s%s %d\n",cadena, "Tabla ", contador);
            // segundo for
            for (int contador2 = 1;contador2 <= limite2; contador2++){
                switch(opcion){
                    case 1: // operacion de suma
                        operacion = contador + contador2;
                        break;
                    case 2: // operacion de resta
                        operacion = contador - contador2;
                        break;
                    case 3: //operacion de multiplicacion
                        operacion = contador * contador2;
                        break;
                    case 4: // opertacion de divicion
                        operacion = contador / contador2;
                        break;
                }
                // imprimimos los valores y los acumulamos en la cadena prinipal
                cadenaTmp = String.format("%d %s %d = %d\n",contador,
                        tipoOperador,contador2,operacion); 
        // Tmp es para formar otra cadena y luego incluirla
                cadena = String.format("%s%s",cadena,cadenaTmp);// las 2 cadenas
            }
        }
    }
        System.out.printf("%s", cadena); // imprime mis tablas
    } // fin de clase Contador For
}
