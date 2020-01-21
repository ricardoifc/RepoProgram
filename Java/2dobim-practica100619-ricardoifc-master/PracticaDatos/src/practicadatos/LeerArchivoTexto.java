package practicadatos;

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
        {
            Scanner entrada = new Scanner(new File(
                    "tabula-FWC_2018_Squadlists_4.csv"));
            double suma1 = 0;
            double suma2 = 0;
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                // System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<>(
                       Arrays.asList(linea.split("//|")));
                // cada que encuentra un espacio el .next lanza la cadena o int
                // va tomando parte por parte 
                double dato1 = Double.parseDouble(linea_partes(11));
                suma1 = suma1 + dato1;
                double dato2 = Double.parsedouble(linea_partes(11));
                suma2 = suma2 + dato2;
                
                

                System.out.printf("%d\n", numero);
                
            } // fin de while
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    private static String linea_partes(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
} // fin de la clase LeerArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 
 *************************************************************************/
