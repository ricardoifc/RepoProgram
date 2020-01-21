/*
Uso de puclic static en varias clases
 */
package manejometodos4;

import java.util.Scanner;

/**
 *
 * @author Ricardo Freire
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // declaro variables
        String nombre;
        String placa;
        int asientos;
        String tipoVehiculo;
        String tipoCombustion;
        // pido datos
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();   
        System.out.println("Ingrese la placa del vehiclo");
        placa = sc.nextLine();
        System.out.println("¿Cuantos asientos tiene?");
        asientos = sc.nextInt();
        sc.nextLine();
        System.out.println("Que tipo de vehiculo es,|automovil|bus|camioneta");
        tipoVehiculo = sc.nextLine();
        System.out.println("Que combustion es |diesel|gasolina");
        tipoCombustion = sc.nextLine();
        
        String ciudad=ManejoVehiculo.obtenerProvinciaVehiculo(placa);
        float costo1 = ManejoVehiculo.obtenerUnoMatricula(asientos,tipoVehiculo);
        // mando el numero de asientos
        float costo2 = ManejoVehiculo.obtenerDosMatricula(tipoCombustion);
        // mando datos de combustion y vehiculo
        float costoTotal = ManejoVehiculo.obtenerCostosFinalMatricula(costo1,
                costo2); // mando datos a sumar y sumar el 10%
     String imprimir = ManejoVehiculo.imprimirDatosVehiculo(nombre,placa,ciudad,
               asientos,tipoVehiculo,tipoCombustion,costo1,costo2,costoTotal);
       System.out.printf("%s", imprimir); // imprimo en pantalla todos los datos
        
    }    
}
