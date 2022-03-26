// Output
// Enter height of triangle : 5
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

        package com.patterns;
import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height of triangle : ");
        int height = input.nextInt();

        for(int i=1; i<=height; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if (sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
