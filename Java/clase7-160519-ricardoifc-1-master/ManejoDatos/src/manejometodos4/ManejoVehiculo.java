/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejometodos4;

/**
 *
 * @author Ricardo Freire
 */
public class ManejoVehiculo {
    public static String obtenerProvinciaVehiculo(String p){
                String placa= p;
                String ciudad = "";
        char valor = placa.charAt(0);
                // en este Switch escojo la ciudad
        switch(valor){
            case 'a':
            case'A':
                ciudad = "Azuay";
                break;
            
            case 'b':
            case 'B':
                ciudad = "Bolivar";
                break;
            case 'u':
            case 'U':
                ciudad = "Cañar";
                break;
            case 'c':
            case 'C':
                ciudad = "Carchi";
                break;
            case 'h':
            case 'H':
                ciudad = "Chimborazo";
                break;
            case 'x':
            case 'X':
                ciudad = "Cotopaxi";
                break;
            case 'o':
            case 'O':
                ciudad = "El Oro";
                break;
            case 'e':
            case 'E':
                ciudad = "Esmeralda";
                break;
            case 'w':
            case 'W':
                ciudad = "Galapagos";
                break;
            case 'g':
            case 'G':
                ciudad = "Guayas";
                break;
            case 'i':
            case 'I':
                ciudad = "Imbabura";
                break;
            case 'l':
            case 'L':
                ciudad = "Loja";
                break;
            case 'r':
            case 'R':
                ciudad = "Los Rios";
                break;
            case 'm':
            case 'M':
                ciudad = "Manabi";
                break;
            case 'v':
            case 'V':
                ciudad = "Morona Santiago";
                break;
            case 'n':
            case 'N':
                ciudad = "Napo";
                break;
            case 'q':
            case 'Q':
                ciudad = "Orellana";
                break;
            case 's':
            case 'S':
                ciudad = "Pastaza";
                break;
            case 'p':
            case 'P':
                ciudad = "Pichincha";
                break;
            case 'y':
            case 'Y':
                ciudad = "Santa Elena";
                break;
            case 'j':
            case 'J':
                ciudad = "Santo Domingo de los Tsáchilas";
                break;
            case 'k':
            case 'K':
                ciudad = "Sucumbíos";
                break;
            case 't':
            case 'T':
                ciudad = "Tunguragua";
                break;
            case 'Z':
            case 'z':
                ciudad = "ZamoRA Chinchipe";
                break;
            
            default:
                System.out.println("No pertenece a Ecuador el vehiculo");
                
        }
        return ciudad; // retorno la ciudad
    }
    public static float obtenerUnoMatricula(int asiento,String tipoVehiculo){
        float asientoTotal;
        if(tipoVehiculo.equals("bus")){
            asientoTotal = asiento * 5;}
        else{asientoTotal = asiento * 50;} // multiplico la ciudad
        return asientoTotal; // retorno valor asientos
    }
    public static float obtenerDosMatricula(String tipoCombustion){
        int costo3 = 0;
        if (tipoCombustion.equals("gasolina")){
            costo3 = 30;
        }else{
            if(tipoCombustion.equals("diesel")){
                costo3 = 80;}
        }
                
        return costo3; // retorno costo de combustion y tipo de vehiculo
    }
    public static float obtenerCostosFinalMatricula(float costo1, float costo2){
        float costoFinal = 0;
        costoFinal = (float)(((costo1 + costo2)*0.10)+(costo1 + costo2));
        return costoFinal; // retorno costo final
        }
    public static String imprimirDatosVehiculo(String nombre, String placa,
            String ciudad,int asientos,String tipoVehiculo,String 
                tipoCombustion, float costo1,float costo2,float costoTotal){
        String imprimir = ""; // una variable con la cual imprimiremos todos
        //  los datos
        imprimir = String.format("%s, propietario del carro:\nPlaca:%s\nDe la "
               + "provincia del %s\nNumero de asientos: %d\nTipo de veículo: %s"
                + "\nTipo de Combustión: %s \n\nCosto1 1a de matricula: %.2f\n"
                + "Costo 2 de matricula: %.2f\n\nCosto final de matricula %.2f"
                ,nombre,placa,ciudad,asientos,tipoVehiculo,tipoCombustion,
                costo1,costo2,costoTotal);
        
        return imprimir; // retorno los datos 
    }
    }
