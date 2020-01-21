/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;
import java.util.Scanner;
/**
 *
 * @author Ricardo Freire
 */
public class Principal {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float tarifa = 3;
    float mensaje=0;
    float total = 0;
    float iva = 0;
    System.out.println("Ingrese los mensajes de este mes");
    mensaje = entrada.nextInt();
    // operaciones menos de 40
    if (mensaje < 40){
        iva = (float) (tarifa*0.12);
        total = (float) (tarifa+iva); 
        System.out.printf("Valor total a pagar es de %.2f\n"
                     ,total);
        
    }else{ // operaciones de 40 a 200
        if (mensaje >= 40 && mensaje <=200){
            tarifa = (float) (tarifa +((mensaje - 40)*0.05));
            iva = (float) (tarifa*0.12);
            total = (float) (iva+tarifa);
             System.out.printf("Valor total a pagar es de %.2f\n"
                     ,total);
            
        }else{// operaciones mas de 200
           if (mensaje >= 200){
            tarifa = (float) (tarifa +((mensaje - 200)*0.1));
            iva = (float) (tarifa*0.12);
            total = (float) (iva+tarifa);
            System.out.printf("Valor total a pagar es de %.2f\n"
                     ,total);
            
           }
        }
    }
    

           }
}