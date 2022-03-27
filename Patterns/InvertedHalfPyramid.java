//This is a program used to print Inverted Half Pyramid with user input.

//Output:
//Enter height of Pyramid : 5
//        *  *  *  *  *
//        *  *  *  *
//        *  *  *
//        *  *
//        *

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height of Pyramid : ");
        int height = input.nextInt();

        for(int i=height; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
