/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal2;
// import paquetedatos.*;
import paquetedatos.Variable;
import paquetedatos.VariableDatos2;

/**
 *
 * @author Ricardo Freire
 */
public class Principal {
    public static void main(String[] arg){
        //metodo principal
        double resultado;
        resultado = Variable.numero1 + Variable.numero2;
        
        System.out.printf("El resultado es: %.1f", resultado);
        
        // Resultado2
        double resultado2;
        resultado2 = Variable.numero1 + VariableDatos2.numero3;
        
        System.out.printf("\nEl resultado es: %.1f", resultado2);
    }
}
