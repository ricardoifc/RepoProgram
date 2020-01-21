/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborotario1.segundobimestre;

/**
 *
 * @author Ricardo Freire
 */
public class Principal {
    public static void main(String[] args) {
        // declaro las variables
    String [] estudiantes = {"Estudiante 1","Estudiante 2","Estudiante 3",
        "Estudiante 4","Estudiante 5","Estudiante 6","Estudiante 7",
        "Estudiante 8","Estudiante 9","Estudiante 10","Estudiante 11",
        "Estudiante 12","Estudiante 13","Estudiante 14", "Estudiante 15"};
    
    int [] notas = {90,80,80,95,55,50,75,100,65,30,75,60,40,20,40};
    
    String[] notaCualitativa = new String[15];
    double promedio = 0;
    int contador;
    // obtenemos notaCualitativa desde la clase Operaciones
    for (contador=0; contador<estudiantes.length; contador++){
    // con el arreglo le asigno a cada uno el estudiante, la nota y calificion
        notaCualitativa[contador] = Operaciones.obtenerNotaCuantitativa(
                estudiantes[contador],notas[contador]);
    }
    // ahora obtenemos el promedio desde la clase Operaiones
    promedio = Operaciones.obtenerPromedioParalelo(notas);
    
    // imprimimos el reporte
    for (contador=0; contador<estudiantes.length; contador++){
        System.out.printf("%s\n", notaCualitativa[contador]);
    }// ahora imprimimos el promedio
    System.out.printf("\nPromedio del paralelo es: %.1f\n", promedio);
    }
    
}
