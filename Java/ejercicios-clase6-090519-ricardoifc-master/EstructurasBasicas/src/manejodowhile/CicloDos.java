/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodowhile;

/**
 *
 * @author jhand
 */
public class CicloDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        String cadena = "";
        int tabla = 10;
        String cadenaTmp = "";
        do{ 
            int valor = contador * tabla;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, contador,
                    valor);
            contador = contador + 1;
        }while (contador<5) ;
        
        System.out.printf("%s", cadena);
        
    }
        
 }
    
    

