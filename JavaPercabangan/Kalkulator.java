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
public class Kalkulator {
    public static void main(String[] args) {
        String operator;
        int angka1;
        int angka2;
        int hasil;
        int sisabagi;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("== Program Sederhana Kalkulator ==");
        System.out.println("Pilih Operator");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Sisa Bagi");
        System.out.print("Pilih 1-5 : ");
        operator = scan.nextLine();
        
        
        switch(operator) {
            case "1":
                System.out.println("\n\n == Selamat Datang di Penjumlahan ==");
                System.out.print("Angka 1 : ");
                angka1 = scan.nextInt();
                System.out.print("Angka 2 : ");
                angka2 = scan.nextInt();
                hasil = angka1 + angka2;
                System.out.println("\nHasil : " + hasil);
                break;
            case "2":
                System.out.println("\n\n == Selamat Datang di Pengurangan ==");
                System.out.print("Angka 1 : ");
                angka1 = scan.nextInt();
                System.out.print("Angka 2 : ");
                angka2 = scan.nextInt();
                hasil = angka1 - angka2;
                System.out.println("\nHasil : " + hasil);
                break;
            case "3":
                System.out.println("\n\n == Selamat Datang di Pembagian ==");
                System.out.print("Angka 1 : ");
                angka1 = scan.nextInt();
                System.out.print("Angka 2 : ");
                angka2 = scan.nextInt();
                hasil = angka1 / angka2;
                System.out.println("\nHasil : " + hasil);
            case "4":
                System.out.println("\n\n == Selamat Datang di Perkalian ==");
                System.out.print("Angka 1 : ");
                angka1 = scan.nextInt();
                System.out.print("Angka 2 : ");
                angka2 = scan.nextInt();
                hasil = angka1 * angka2;
                System.out.println("\nHasil : " + hasil);
                break;
            case "5":
                System.out.println("\n\n == Selamat Datang di Sisa Bagi ==");
                System.out.print("Bilangan : ");
                angka1 = scan.nextInt();
                System.out.print("Pembagi : ");
                angka2 = scan.nextInt();
                sisabagi = angka1 % angka2;
                hasil = (angka1 - sisabagi) / angka2;
                System.out.println("\n" + angka1 + " Dibagi dengan " + angka2 + " Adalah " +  hasil + " Sisa " + sisabagi);
                break;
        }
        
        
        
    }
}
