/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author reroes
 */
public class LecturaJson {
    
    public static void leerDatos() {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        
        try 
        {
            FileReader reader = new FileReader("data/registros.json");
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray employeeList = (JSONArray) obj;
            // System.out.println(employeeList);
             
            // Iterate over employee array
            
            for (int i = 0; i < employeeList.size(); i++) {
                // parseEmployeeObject(employeeList.get(i);
                JSONObject registro = (JSONObject) employeeList.get(i);
                System.out.println(registro);
                parseEmployeeObject(registro);
            }
 
        } catch (Exception e) {
            System.out.println(e);
        
        }
    }
 
    private static void parseEmployeeObject(JSONObject employee)
    {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");
         
        //Get employee first name
        String firstName = (String) employeeObject.get("firstName");   
        System.out.println(firstName);
         
        //Get employee last name
        String lastName = (String) employeeObject.get("lastName"); 
        System.out.println(lastName);
         
        //Get employee website name
        String website = (String) employeeObject.get("website");   
        System.out.println(website);
    }
}
