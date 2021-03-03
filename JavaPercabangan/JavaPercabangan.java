/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPercabangan;

/**
 *
 * @author raywi
 */

// library
import java.util.Scanner;

public class JavaPercabangan {
    
    // method main
    public static void main(String[] args) {
        // deklarasi variabel
        int num1 = 12;
        int num2 = 32;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("== Operator Perbandingan ==");
        System.out.print("Nilai 1 : ");
        num1 = scan.nextInt();
        System.out.print("Nilai 2 : ");
        num2 = scan.nextInt();
        
        
        if(num1 > num2){
            System.out.println(num1 + " Lebih besar dari " + num2);
        } else if (num1 < num2){
            System.out.println(num1 + " Lebih kecil dari " + num2);
        } else {
            System.out.println("Tidak ada nilai");
        }
    }
    
}
