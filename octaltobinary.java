/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OctalToBinary;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class octaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //objek input
        System.out.print("Masukkan input bilangan oktal:");
        String oktal = sc.nextLine();
        int[] arr = new int[3];
        String[] lib = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String hasil = "";
        for(int i = 0; i < oktal.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(oktal.charAt(i)));
            hasil += lib[arr[i]];
        }
        System.out.println("Hasil konversi bilangan oktal " + oktal + " ke biner adalah: " + hasil);
    }
}
