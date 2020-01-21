/*
x
 */
package estructurasbasicas;

import java.util.Scanner;

/**
 * @author ricardoifc
 */
public class CiclonWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        String mensajeFinal = "";
        String nombre = "";
        String apellido = "";
        String profesion = "";
        int contador = 1;
        boolean bandera = true;
        String opcion = "";
        
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal,
                "Informe de la ciudad de Loja");
        mensajeFinal = String.format("%s\n\n",mensajeFinal,
                "Lista de Personas");
        while(bandera==true){
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
            System.out.print("Escribir s para seguir\n");
            opcion = entrada.nextLine();
            
            if(opcion.equals("s")){
                bandera = true;}
            else{
                bandera = false;
            }
            // System.out.printf("%s: %s %s - %s\n" ,mensajeFinal,nombre,
            // "apellido,profesion);
           // contador = contador + 1; // que el contador incremente
        }
        System.out.printf("%s",mensajeFinal);
        
    }
    
}
