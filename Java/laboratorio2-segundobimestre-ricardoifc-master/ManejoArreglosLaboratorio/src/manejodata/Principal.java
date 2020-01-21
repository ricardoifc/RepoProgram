/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodata;

/**
 *
 * @author ricardoifc
 */
public class Principal {
    public static void main(String[] args) {
        // declaro las variables
    String[] estudiantes = {"M. RAMÍREZ","P. BELLOLIO", "J. LARA", "J. POROZO"
       , "J. ESPINOZA", "L. CASTILLO", "L. LOOR","J. ALCÍVARL.", "L.ESTUPIÑAN"};
    int [] notasMat = {19,20,10,20,18,17,15,10,17};
    int [] notasLiteratura = {18,17,13,19,12,14,13,11,12};
    int [] notasMusica = {20,17,10,20,15,18,13,19,11};
    String [] promedioCuantitativo = new String [9];
    double [] promedioAsignatura = new double[3];
    double promedioParalelo = 0;
    double [] promedioEstudiante = new double[9];
    String reporte = "";
    int aux;
    int contador;
    int est; // para inicializar en 1, Estudiante 1:
    // obtener promedio por asignatura
    aux = 0; // para promedio de Matematicas
    for (contador = 0; contador < estudiantes.length; contador++){
        promedioAsignatura[aux] = promedioAsignatura[aux]+
                notasMat[contador];
    }
    promedioAsignatura[aux] = promedioAsignatura[aux] / estudiantes.length;
    promedioParalelo = promedioParalelo + promedioAsignatura[aux];
    
    aux = 1; // para promedio de Literatura
    
    for (contador = 0; contador<estudiantes.length; contador++){
        promedioAsignatura[aux] = promedioAsignatura[aux] + 
                notasLiteratura[contador];
    }
    promedioAsignatura[aux] = promedioAsignatura[aux] / estudiantes.length;
    promedioParalelo = promedioParalelo +promedioAsignatura[aux];
    
    aux = 2; // para promedio de Musica
    
    for (contador = 0; contador<estudiantes.length; contador++){
        promedioAsignatura[aux] = promedioAsignatura[aux] +
                notasMusica[contador];
    }
    promedioAsignatura[aux] = promedioAsignatura[aux] / estudiantes.length;
    promedioParalelo = promedioParalelo + promedioAsignatura[aux];
    // dividpo la suma de promedio paralelo para tamaño de aray
    promedioParalelo = promedioParalelo / promedioAsignatura.length;
    // entro en mi cadena cada ciclo
    reporte = String.format("%sPromedio Generales por asignatura\n\n"
            + "Matematicas: %.2f\nLiteratura: %.2f\nMusica %.2f\n\nEl promedio"
            + " del paralelo es: %.2f\n\n",reporte ,promedioAsignatura[0] ,
            promedioAsignatura[1], promedioAsignatura[2] ,promedioParalelo);
    System.out.printf("%s", reporte);
    // calculo el promedio por estudiante y el cuantitativo en Operaciones class
    for (contador = 0; contador<estudiantes.length; contador++){
        promedioEstudiante[contador]= (notasMat[contador] + 
                notasLiteratura[contador] + notasMusica[contador])/ 3;
        promedioCuantitativo[contador] = Operacion.
                obtenerPromedioCuantitativo(promedioEstudiante[contador]);
    }
    // un ciclo para acumular las notas, el promedio y cuantitativo de estudian
    for (contador = 0; contador<estudiantes.length; contador++){
        est = contador + 1; 
        reporte = String.format("%sEstudiante %d:   %s\n  Asignatura Matemát"
                + "icas: %d\n  Asignatura Literautura: %d\n  Asignatur"
                + "a Música: %d\n  Promedio del estudiante: %.2f\n  Promed"
                + "io cuantitativo: %s\n\n",reporte,est,estudiantes[contador],
                notasMat[contador],notasLiteratura[contador],
                notasMusica[contador],promedioEstudiante[contador],
                promedioCuantitativo[contador]);
    }
    // presento en pantalla
    System.out.printf("%s",reporte);

    }
}
