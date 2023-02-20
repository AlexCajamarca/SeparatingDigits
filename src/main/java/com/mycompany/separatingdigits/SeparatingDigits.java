/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.separatingdigits;

import java.util.Scanner;

/**
 *
 * @author alexc
 */
public class SeparatingDigits {

    public static void quotientDigits (int a, int b ){
 
        int quotient = a/b;
        int Intpart = quotient;
        System.out.println(Intpart);
       
    }
    public static void integerDigits (int a, int b ){

       int remainder = a%b;
       System.out.println(remainder);
    }
    public static void displayDigits (int num){
        if (num < 1 || num > 99999 )
        {
           System.exit(0);
           
        }
          
        String digits =" ";
        while (num > 0)
        {
          
            int digit = num % 10;
            digits = digit + " "+ digits;
            num /= 10;
            
        }
        System.out.println(digits);
    
}
       
        
    }

