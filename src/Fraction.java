/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 1.1
 * File Name: Favorite.java
 */

// Takes numerator and denominator from user input and outputs a decimal anwser

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        //Numerator
        int numerator, denominator;
        double fraction;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter numerator: ");
        numerator = scan.nextInt();
        
        System.out.print("Enter denominator: ");
        denominator = scan.nextInt();
        
        float numFloat = numerator;
        float denFloat = denominator;
        
        fraction = numFloat / denFloat;
        
        System.out.print("Anwser: " + fraction);
        
    }
    
}
