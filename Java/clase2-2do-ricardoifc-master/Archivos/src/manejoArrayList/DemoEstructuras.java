/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoArrayList;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class DemoEstructuras {
    public static void main(String[] args) {
        int [] edades = {10, 11, 12, 9, 2, 1};
        ArrayList <Integer> edades2 = new ArrayList<>();
        
        for (int i = 0; i < edades.length; i++) {
            edades2.add(edades[i]);
        }
        
        System.out.println(edades2);
        
        


    }
}
