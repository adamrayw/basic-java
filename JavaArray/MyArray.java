/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaArray;

import java.util.Scanner;
/**
 *
 * @author raywi
 */
public class MyArray {
    
    public static void main(String[] args) {
        
        // membuat array
        String[] nama = new String[5];
        
        Scanner scan = new Scanner(System.in);
        
        // mencetak semua isi array dengan foreach
        for( int i = 0; i < nama.length; i++) {
            System.out.print("Buah ke - " + i + " : ");
            nama[i] = scan.nextLine();
        }
        
        for(String n : nama) {
            System.out.println(n);
        }
    }

}
