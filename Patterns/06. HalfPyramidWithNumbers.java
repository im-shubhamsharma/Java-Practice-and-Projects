// Output:
// Enter height/max number in pyramid : 6
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6

        package com.patterns;
import java.util.Scanner;

public class HalfPyramidWithNumbers {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height/max number in pyramid : ");
        int max = input.nextInt();

        for(int i=1; i<=max; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
