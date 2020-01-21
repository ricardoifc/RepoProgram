/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author reroes
 */
public class DemoEstructurasDos {
    public static void main(String[] args) {
        String [] edades = {"10", "11", "12", "9", "2", "1"};
        ArrayList <String> edades2 = new ArrayList<>(Arrays.asList(edades));
        //
        for (int i = 0; i < edades2.size(); i++) {
            System.out.printf("%s\n", edades2.get(i));;
        }
        
        
        
        


    }
}
