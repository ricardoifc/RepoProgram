/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupal004;


import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author Leonardo Aguilar
 */
public class LecturaJson {

    public static void leerDatos() {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        
        double sumaNotas = 0;
        double promedio;
        
        try 
        {
            FileReader reader = new FileReader("registros2.json");
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray notaList = (JSONArray) obj;
            // System.out.println(employeeList);
             
            // Iterate over employee array
            
            for (int i = 0; i < notaList.size(); i++) {
                // parseEmployeeObject(employeeList.get(i);
                JSONObject registro = (JSONObject) notaList.get(i);
                
                //Get employee object within list
                
                JSONObject employeeObject = (JSONObject) registro.get("estudiante");
                String nota = (String) employeeObject.get("calificacion");   
                
                sumaNotas += Integer.parseInt(nota);
            }
            
            promedio = sumaNotas / notaList.size();
            
            System.out.println("La suma de notas es de " + sumaNotas + "\n" +
                               "y el promedio es de " + promedio);
            
        } catch (Exception e) {
            System.out.println(e);
        
        }
    }
    
    
}
