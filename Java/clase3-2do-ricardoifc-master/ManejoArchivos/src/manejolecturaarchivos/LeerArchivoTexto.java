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
        {
            // instalar un editor tipo SublimeText
            // Scanner entrada = new Scanner(new File("data/datos.txt"));
            Scanner entrada = new Scanner(new File("datos/nacimientos2014_001.csv"));
            // System.out.println(entrada.hasNext());
            System.out.println("a");
            int suma = 0;
            int suma2 = 0;
            double promedio = 0;
            double promedio2 = 0;
            int contador = 0;
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
               // System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split("\\|")));
                // System.out.println(linea_partes.size());
                // System.out.println(linea_partes);
                String auxiliar = linea_partes.get(11);
                String auxiliar2 = linea_partes.get(12);
                int valor = 0;
                int valor2 = 0;
                if(auxiliar.equals("talla")| auxiliar.equals("NA")){
                    valor = 0;
                }else{
                    valor = Integer.parseInt(auxiliar);
                }
                
                if(auxiliar2.equals("peso")| auxiliar2.equals("NA")){
                    valor = 0;
                }else{
                    valor2 = Integer.parseInt(auxiliar2);
                }
                System.out.printf("%d\n",valor);
                System.out.printf("%d\n",valor2);
                suma = suma + valor;
                suma2 = suma2 + valor2;
                contador= contador + 1;
            } // fin de while
            promedio = (double)suma / (contador -1);
            promedio2 = (double)suma2 / (contador -1);
            System.out.printf("suma: %d\npromedio: %.2f\nsuma2: %d\npromedio: %.2f\n",suma,promedio,suma2
                    ,promedio2);
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.err.println(e);
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    
} // fin de la clase LeerArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 
 *************************************************************************/
