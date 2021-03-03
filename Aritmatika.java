/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOperator;

import java.util.Scanner;

/**
 *
 * @author raywi
 */
public class Aritmatika {
    
    public static void main(String[] args){
        // deklarasi tipe data dan nama variabel
        int angka1;
        int angka2;
        int hasil;
        
        // library
        // membuat scanner untuk mengambil data yang diinput user
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Angka 1 : ");
        angka1 = keyboard.nextInt();
        System.out.print("Angka 2 : ");
        angka2 = keyboard.nextInt();
        
        hasil = angka1 + angka2;
        
        System.out.println(hasil);
    }
}
