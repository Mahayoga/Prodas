/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwapVariable;

/**
 *
 * @author Personal
 */
public class SwapVariableWithoutTemp {
    public static void main(String[] args) {
        // int, double, float
        int a, b;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        a = a + b; //15 + 27 = 42
        b = a - b; //42 - 27 = 15
        a = a - b; //42 - 15 = 27
        System.out.println("After swapping : a, b = "+a+", "+ + b);
    }
}
