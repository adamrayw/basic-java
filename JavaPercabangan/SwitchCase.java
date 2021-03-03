/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPercabangan;

import java.util.Scanner;
/**
 *
 * @author raywi
 */
public class SwitchCase {
    
    // method main
    public static void main(String[] args) {
        // membuat variabel nama dan scanner
        String lampu;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Warna : ");
        lampu = keyboard.nextLine();
        
        // switch case
        switch(lampu) {
            case "merah" :
                System.out.println("Lampu berwarna merah");
                break;
            case "biru" :
                System.out.println("Lampu berwarna biru");
                break;
            default:
                System.out.println("Warna lampu tidak tersedia.");
        }
    }
}
