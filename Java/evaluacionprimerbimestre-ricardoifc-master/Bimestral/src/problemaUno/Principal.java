/*
Problema 1
 */
package problemaUno;

import java.util.Scanner;

/**
 *
 * @author ricardoifc
 */
public class Principal {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int vendidos;
    int devueltos;
    int sucursal = 1;
    float vendidosTotal = 0;
    float devueltosTotal = 0;
    int dia = 1;
    float falla;
    String cadena = "";
    while(sucursal <= 4){ // sucursales
        System.out.printf("Sucursal %d\n",sucursal);
        while(dia<=7){ // dias
            System.out.printf("Dia %d:  Cantidad de libros vendidos : ",dia);
            vendidos = sc.nextInt(); // ingresamos por teclado
            vendidosTotal = (float)(vendidos + vendidosTotal);
            System.out.printf("\tCantidad de libros devueltos : ");
            devueltos = sc.nextInt(); // sumamos
            devueltosTotal = (float)(devueltos + devueltosTotal); // sumamos
            
            dia = dia +1; // dia + 1
        } // fin dias
        falla = (devueltosTotal / vendidosTotal);
        cadena = String.format("%sSucursal %d\t%.0f\t\t%.0f\t\t%.2f \n",
                cadena,sucursal,vendidosTotal,devueltosTotal,falla);
        
        sucursal = sucursal + 1; // aumentamos 1
        dia = 1;
        vendidosTotal = 0; // reseteamos
        devueltosTotal = 0; // reseteamos
    } // fin sucursal
    System.out.println("Registro de ventas de la librería\n\nSucursales\t"
            + "L. Vendidos\tL. Devueltos\t% Fallas");
    System.out.printf("%s", cadena);
    } // fin clase
}
