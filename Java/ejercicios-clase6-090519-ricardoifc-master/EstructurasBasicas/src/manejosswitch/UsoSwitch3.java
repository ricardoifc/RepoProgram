/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

/**
 *
 * @author reroes
 */
public class UsoSwitch3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre = "esmeraldas";
        char valor = nombre.charAt(0);
                
        switch(valor){
            case 'a':
            case'A':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toUpperCase());
                break;
            
            case 'e':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;    
            
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
