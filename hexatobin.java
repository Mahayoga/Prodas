/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HexadecimalToBinary;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class hexatobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan input bilangan Hexadesimal:");
        String hex = sc.nextLine();
        String[] lib = {"A", "B", "C", "D", "E", "F"};
        int[] lib2 = {10, 11, 12, 13, 14, 15};
        String[] lib3 = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        String result = "";
        for(int i = 0; i < hex.length(); i++) {
            for(int j = 0; j < lib.length; j++) {
                if((String.valueOf(hex.charAt(i))).equals(lib[j])) {
                    result += lib3[Integer.parseInt(String.valueOf(lib2[j]))];
                }
            }
            if("A".equals(String.valueOf(hex.charAt(i))) || "B".equals(String.valueOf(hex.charAt(i))) || "C".equals(String.valueOf(hex.charAt(i))) || "D".equals(String.valueOf(hex.charAt(i))) || "E".equals(String.valueOf(hex.charAt(i))) || "F".equals(String.valueOf(hex.charAt(i)))) {
                //Nope
            } else {
                result += String.valueOf(lib3[Integer.parseInt(String.valueOf(hex.charAt(i)))]);
            }
        }
        System.out.println("Hasil konversi Hexadesimal " + hex + " ke bilangan Biner adalah " + result);
    }
}
