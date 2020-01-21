/*
x
 */
package estructurasbasicas;

import java.util.Scanner;

/**
 * @author ricardoifc
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        String mensajeFinal = "";
        String nombre = "Ricardo Israel";
        String apellido = "Freire Carrion";
        String profesion = "Estudiante";
        int contador = 1;
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal,
                "Informe de la ciudad de Loja");
        mensajeFinal = String.format("%s\n\n",mensajeFinal,
                "Lista de Personas");
        while(contador <5){
            System.out.println("Ingrese sus nombres");
            nombre = entrada.nextLine();
            System.out.println("Ingrese sus apellidos");
            apellido = entrada.nextLine();
            System.out.println("Ingrese sus profesión");
            profesion = entrada.nextLine();
            mensajeFinal = String.format("%sPersona "
                    + "%d: %s %s - %s\n",
                    mensajeFinal,contador,nombre,apellido,profesion);
            contador = contador + 1;
            // System.out.printf("%s: %s %s - %s\n" ,mensajeFinal,nombre,
            // "apellido,profesion);
           // contador = contador + 1; // que el contador incremente
        }
        System.out.printf("%s",mensajeFinal);
        
    }
    
}
