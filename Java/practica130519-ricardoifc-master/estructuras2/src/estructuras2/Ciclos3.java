/*
Estructuras2
 */
package estructuras2;

/**
 @author Ricardo Freire
 */
public class Ciclos3 {
    public static void main(String[] args) {
        // el encabezado de la instrucción for incluye la inicilializacion,
        // la condición de continuacion de ciclo y el incremento
        String cadena = "";
        int limite1 = 5;
        int limite2 = 12;
        int operacion = 0; // atención
        String cadenaTmp = ""; // cadena demporal
        cadena = String.format("%s%s\n", cadena, "Tabal de multiplocar");
        // primer for
        for (int contador=2;contador <=limite1; contador++) {
            cadena = String.format("%s%s %d\n",cadena, "Tabla ", contador);
            for (int contador2 = 1;contador2 <= limite2; contador2++){
                operacion = contador * contador2;
                cadenaTmp = String.format("%d * %d = %d\n",contador,contador2
                ,operacion); // Tmp es para formar otra cadena y luego incluirla
                cadena = String.format("%s%s",cadena,cadenaTmp);// las 2 cadenas
            }
        }
        System.out.printf("%s", cadena); // imprime mis tablas
    } // fin de clase Contador For
    
}
