/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author Ricardo Freire
 */
public class Ecuacion {
        public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
double a = 2;
double b = 4;
double d = 6;
double e = 8;
double x = 10;
double y = 12;
double c;
double f;
double xx;
double yy;
c = (a*x)+(b*y);
f = (d*x) + (e*y);
x = (c*e)-(b*f)/(a*e)-(b*d);
y = (a*f)-(c*d)/(a*e)-(b*d);
System.out.printf("Valor de x es: %d\nValor de y es: %d",xx,yy);


            
    }
    
}
