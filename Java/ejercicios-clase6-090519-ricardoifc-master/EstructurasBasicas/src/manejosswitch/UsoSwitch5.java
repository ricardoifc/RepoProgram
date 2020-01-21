/*
Desarrolar una aplicacion que me permita aplicar placas de carros
Se asume que las placas ingresadas pertenecen a la region costa del Ecuador
En base a la placa nuestro programa determinara y presentara la probincia a la 
que pertenece
O,M,Y,J
 */
package manejosswitch;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre = "maac1234";
        char valor = nombre.charAt(0);
                
        switch(valor){
            case'o':
            case'O':
                System.out.printf("La placa pertenece a El Oro con letra %s de"
                        + " %s\n", 
                        valor, nombre.toUpperCase());
                break;
            case 'e':
            case'E':
                System.out.printf("La placa pertenece a Esmeraldas con letra %s"
                        + " de %s\n", 
                        valor, nombre.toUpperCase());
                break;   
            case 'g':
            case'G':
                System.out.printf("La placa pertenece a Guayas con letra %s de"
                        + " %s\n", 
                        valor, nombre.toUpperCase());
                break;
                
            case 'r':
            case'R':    
                System.out.printf("La placa pertenece a Los Rios con letra %s "
                        + "de %s\n", 
                        valor, nombre.toUpperCase());
                break;               
            case 'm':
            case'M':    
                System.out.printf("La placa pertenece a Manabi con letra %s de "
                        + "%s\n", 
                        valor, nombre.toUpperCase());
                break;
            case 'y':
            case'Y':    
                System.out.printf("La placa pertenece a Santa Elena con letra "
                        + "%s de %s\n", 
                        valor, nombre.toUpperCase());
                break;
            case 'j':
            case'J':    
                System.out.printf("La placa pertenece a Santo Domingo de los"
                        + " Tsáchilas con letra %s de %s\n",valor, 
                        nombre.toUpperCase());
                break; 
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
