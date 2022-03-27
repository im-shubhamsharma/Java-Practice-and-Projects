//This is a program used to print Inverted Half Pyramid (rotated by 180 degree) with user input.

// Output:
// Enter Height of Pyramid : 5
//         *
//       * *
//     * * *
//   * * * *
// * * * * *

import java.util.Scanner;

public class InvertedHalfPyramids2 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Height of Pyramid : ");
        int height = input.nextInt();

        for(int i=1; i<=height; i++){
            //to print spaces
            for(int j=i; j<height; j++){
                System.out.print("  ");
            }
            //to print stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
