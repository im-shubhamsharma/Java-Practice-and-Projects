//Output
//Enter height/max number in pyramid : 5
//        1
//       2 2
//      3 3 3
//     4 4 4 4
//    5 5 5 5 5

package com.patterns;
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height/max number in pyramid : ");
        int max = input.nextInt();

        for(int i=1; i<=max; i++){
            for (int j=i; j<max; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
