package manejolecturaarchivos;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.
import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto {
    
    // lee registro del archivo
    public static void leerRegistros() {

        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        { // con new File abrir la ruta del archivo
            // puedo abrir de "d:/data/cursos.txt
            
            Scanner entrada = new Scanner(new File("data/datos.txt"));
            double suma = 0;
            int contador = 0;
            double promedio;
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                // System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<>(
                       Arrays.asList(linea.split(";")));
               System.out.println(linea_partes.get(3));
               double dato = Double.parseDouble(linea_partes.get(3));
               // convertir a double con Double.parseDouble
               suma = suma + dato;
               contador = contador + 1;
                // con line_partes da todos, con .get(3) da la tercra poscición
            } // fin de while
            entrada.close(); // ciero mi entrada
            promedio = suma / contador;
            System.out.printf("La suma de sueldos es %.2f\nPromedio: %.2f\n"
                    , suma,promedio);
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    
} // fin de la clase LeerArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 
 *************************************************************************/
