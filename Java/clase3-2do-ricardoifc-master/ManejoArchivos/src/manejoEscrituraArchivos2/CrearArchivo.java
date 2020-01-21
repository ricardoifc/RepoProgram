package manejoEscrituraArchivos2;

import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class CrearArchivo {
    // agrega registros al archivo
    public static void agregarRegistros(String cadena1, String cadena2){
        try {
            String ruta = String.format("estudiantes/%s.txt", cadena1);
            Formatter salida = new Formatter(ruta);
            // el archivo que va a crear
            salida.format("%s\n", cadena2);
            // lo que va a contener el archivo
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.err.println(e);
            System.exit(1);

        }

    } // fin método agregarRegistros
}
