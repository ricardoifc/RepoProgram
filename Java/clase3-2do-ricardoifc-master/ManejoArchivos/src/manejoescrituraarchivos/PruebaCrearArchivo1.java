package manejoescrituraarchivos;

import java.util.Scanner;

public class PruebaCrearArchivo1 {

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        boolean bandera = false;
        String reporte = "";
        int contador = 0;
        String opcion = "";
        String nombre = "";
        String apellido = "";
        String institucion = "";
        reporte = String.format("%sReporte de estudiatnes\n\n", reporte);
        
        while(bandera == false){
            System.out.println("Ingrese su nombre");
            nombre = sc.nextLine();
            System.out.println("Ingrese sus apellidos");
            apellido = sc.nextLine();
            System.out.println("Nombre de la institución");
            institucion = sc.nextLine();
            System.out.println("¿Desea salir? (si/no)");
            opcion = sc.nextLine();
            if(opcion.equals("si")){
                bandera = true;
            }
            reporte = String.format("%s|Nombre: |%s\n|apellido: |%s|Institución: "
                    + "|%s|\n\n", reporte, nombre,apellido,institucion);
            contador = contador + 1;            
        }
        System.out.printf("%s",reporte);
        CrearArchivoTexto.agregarRegistros(reporte);
        

    } // fin de main
} // fin de la clase PruebaCrearArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *************************************************************************/
