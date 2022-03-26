//This is a program used to print solid rectangle with user input.

// Output:
// Enter Width of rectangle : 4
// Enter Length of rectangle : 6
//        *  *  *  *  *  *
//        *  *  *  *  *  *
//        *  *  *  *  *  *
//        *  *  *  *  *  *

package com.patterns;

import java.util.Scanner;

public class SolidRectangle {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Width of rectangle : ");
        int width = input.nextInt();
        System.out.print("Enter Length of rectangle : ");
        int length = input.nextInt();

        for (int i=0; i<width; i++){
            for(int j=0; j<length; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
