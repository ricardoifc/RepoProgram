/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaDos;

/**
 *
 * @author reroes
 */
public class ClaseLogica {
    public static float obtenerBono(int sueldo,int goles){
        float bono = sueldo * goles;
        return bono;
    }
    public static float obtenerTotalSueldo(int sueldo,float  bono){
        float total = sueldo + bono;
        return total;
    }
    public static String obtenerTipo(int goles){
        String tipo= "";
        if(goles <= 3){
            tipo = "NoRenovado";
        }else{
            if(goles <=6){
                tipo = "Pendiente";
            }else{
                if(goles >=7){
                    tipo = "Renovado";
                }
            }
        }
        return tipo;
    }
}
