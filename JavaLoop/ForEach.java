/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLoop;

/**
 *
 * @author raywi
 */
public class ForEach {
    
    public static void main(String[] args) {
        // membuat array
        int myArray[] = {12,44,12,3,212,4,};
        
        for(int item : myArray) {
            System.out.println(item + " ");
        }
    }
}