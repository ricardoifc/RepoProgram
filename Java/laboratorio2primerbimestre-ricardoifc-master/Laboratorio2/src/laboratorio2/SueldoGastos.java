/*
Desarrollar una aplicación en Java que permita ingresar información de varios
padres de familia
 */
package laboratorio2;
import java.util.Scanner;

/**
 *
 * @author Ricardo Freire
 */
public class SueldoGastos {
public static void main(String[] args) {
Scanner entrada = new Scanner (System.in); // ponemos un scanner

String nombre,apellido; // declaramos variables
float pasaje,bar,salidas;
int hijos = 0;
float sueldo;
float pasajesTotal = 0;
float barTotal = 0;
float salidasTotal = 0;
float total;
String reporteFinal = "";
String reporte = "";
boolean bandera = true;
String opcion = "";
    // pedimos datos
    System.out.println("Ingrese sus nombres");
            nombre = entrada.nextLine(); 
    System.out.println("Ingrese sus apellidos");
            apellido = entrada.nextLine();
    System.out.println("Ingrese su sueldo semanal");
            sueldo = entrada.nextFloat();
entrada.nextLine(); // limpiamos buffer
while(bandera==true){ // abrimos un bucle
     hijos = hijos + 1; // contador
     // pedimos datos de cada hijo
    System.out.printf("cuanto es el pasaje semanal de su hijo %d\n",hijos);
            pasaje = entrada.nextFloat();            
    System.out.printf("cuanto gasta en bar de su hijo %d\n",hijos);
            bar = entrada.nextFloat();
    System.out.printf("cuanto gasta en salidas su hijo %d\n",hijos);
            salidas = entrada.nextFloat();
            // sumamos los valores 
    pasajesTotal = (pasaje + pasajesTotal);
    barTotal = (bar + barTotal);
    salidasTotal = (salidas + salidasTotal);
    reporteFinal = String.format("%sHijo %d: \t%.1f\t%.1f\t%.1f\n",
                    reporteFinal,hijos,pasaje,bar,salidas);
    entrada.nextLine();
     // con un boolaneo para salir del bucle
        System.out.print("Escribir s para salir\n");
        opcion = entrada.nextLine();
            
        if(opcion.equals("s")){
            bandera = false;}
}
// sumamos el total
total = sueldo -(pasajesTotal + barTotal + salidasTotal);
// escribimos en pantalla 
reporteFinal = String.format("Reporte Gastos de Padres de Familia\nNombre de "
        + "Padre de Familia: %s %s\nSueldo Semanal: %s\nNúmero de Hijos: "
        + "%s\n\nReporte de Gastos\nPersona\t\tPasaje\t"
        + "Bar\tSalidas\n%s",nombre,apellido,sueldo,hijos,reporteFinal);
System.out.printf("%sTotales\t\t%.1f\t%.1f \t%.1f\n"
        ,reporteFinal,pasajesTotal,barTotal,salidasTotal);
//bucle para saber si falta o sobra
if(total > 1){
    reporte = "alzanza, sobra";
}else{
    if(total <= 0){
        reporte = "Falta";
    }
}
System.out.printf("El padre de familia %s %s le %s el dinero semanal, para sus"
        + " gastos",nombre,apellido,reporte);
/*System.out.print("El padre de familia "+nombre+" "+apellido+" le "+reporte+" "
        + "el dinero semanal, para sus gastos\n");*/
}}
