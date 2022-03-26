//This is a program used to print Half Pyramid with user input.

// Ouput:
// Enter height of Pyramid : 5
//        *
//        *  *
//        *  *  *
//        *  *  *  *
//        *  *  *  *  *

package com.patterns;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height of Pyramid : ");
        int height = input.nextInt();

        for (int i=1; i<=height; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
