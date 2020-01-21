/*
Ejercicio 1
 */
package parcial;

/**
 *
 * @author ricardoifc
 */
public class Principal {
    public static void main(String[] args) {
    String[] estudiantes = {"Megan Humphrey", "Keith Nguyen", 
        "Stephanie Parker", "Christopher Torres", "Tammy Valdez", 
        "Theresa Rodriguez", "James Bartlett", "Cheryl Duffy", 
        "Edward Stevens", "Randy Hale"};
    double [] notasPro = {19.1, 20.0, 10.3, 19.4, 16.5, 17.6, 15.7, 14.8,
        13.1, 13.1};
    double [] notasBD = {18.2, 17.2, 13.2, 19.2, 12.2, 14.2, 13.2, 11.2,
        12.2, 12.2};
    double [] notasRN = {20.0, 17.2, 10.1, 20.0, 15.6, 18.5, 13.4, 19.3,
        11.2, 11.1};
    String [] promedioCuantitativo = new String [estudiantes.length];
    String [] cuantitativaPro = new String [estudiantes.length];
    String [] cuantitativaBD = new String [estudiantes.length];
    String [] cuantitativaRN = new String [estudiantes.length];
    double [] promedioAsignatura = new double[3];
    double promedioParalelo = 0;
    double [] promedioEstudiante = new double[estudiantes.length];
    String reporte = "";
    int est; // para inicializar en 1, Estudiante 1:
    int aux;
    int contador;
    reporte = String.format("%sPromedio Generales por asignatura\n\n",reporte);
    aux = 0; // para promedio de Programación
    for (contador = 0; contador < estudiantes.length; contador++){
        promedioAsignatura[aux] = promedioAsignatura[aux] +
                notasPro[contador];
    }
    promedioAsignatura[aux] = promedioAsignatura[aux] / estudiantes.length;
    promedioParalelo = promedioParalelo + promedioAsignatura[aux];
    
    aux = 1; // para promedio de Base de Datos
    for (contador = 0; contador < estudiantes.length; contador++){
        promedioAsignatura[aux] = promedioAsignatura[aux] + 
                notasBD[contador];
    }
    promedioAsignatura[aux] = promedioAsignatura[aux] / estudiantes.length;
    promedioParalelo = promedioParalelo + promedioAsignatura[aux];
    
    aux = 2; // para promedio de Realidad Nacional
    for (contador = 0; contador < estudiantes.length; contador++){
        promedioAsignatura[aux] = promedioAsignatura[aux] +
                notasRN[contador];
    }
    promedioAsignatura[aux] = promedioAsignatura[aux] / estudiantes.length;
    promedioParalelo = promedioParalelo + promedioAsignatura[aux];
    promedioParalelo = promedioParalelo / promedioAsignatura.length;
         reporte = String.format("%sProgramacion: %.2f\nBase de Datos: %.2f\n"
                 + "Realidad Nacional %.2f"
                 + "\n\nEl promedio del paralelo es: %.2f\n\n",reporte,
                 promedioAsignatura[0], promedioAsignatura[1], 
                 promedioAsignatura[2] ,promedioParalelo);
          // calculo el promedio por estudiante y el cuantitativo en Operaciones
          // class
          
    for (contador = 0; contador < estudiantes.length; contador++){
        cuantitativaPro[contador] = Operacion.
                obtenerPromedioCuantitativo(notasPro[contador]);
        cuantitativaBD[contador] = Operacion.
                obtenerPromedioCuantitativo(notasBD[contador]);
        cuantitativaRN[contador] = Operacion.
                obtenerPromedioCuantitativo(notasRN[contador]);
        promedioEstudiante[contador] = (notasPro[contador] + 
                notasBD[contador] + notasRN[contador]) / 3;
        promedioCuantitativo[contador] = Operacion.
                obtenerPromedioCuantitativo(promedioEstudiante[contador]);
    }
    // un ciclo para acumular las notas, el promedio y cuantitativo de estudian
    for (contador = 0; contador < estudiantes.length; contador++){
        est = contador + 1; 
        reporte = String.format("%sEstudiante %d:   %s\n  Asignatura programac"
                + "ion: %.2f equivalente  a %s\n  Asignatura Base de Datos: "
                + "%.2f equivalente  a %s\n  Asignatura "
                + "Realidad Nacional: %.2f equivalente  a %s\n  Promedio del "
                + "estudiante: %.2f\n  "
                + "Promedio cuantitativo: %s\n\n",reporte, est, 
                estudiantes[contador], notasPro[contador],
                cuantitativaPro[contador], notasBD[contador],
                cuantitativaBD[contador], notasRN[contador],
                cuantitativaRN[contador], promedioEstudiante[contador],
                promedioCuantitativo[contador]);
    }
    // presento en pantalla
    System.out.printf("%s", reporte);
    }
}
