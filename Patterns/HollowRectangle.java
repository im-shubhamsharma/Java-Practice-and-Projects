// This is a program used to print hollow rectangle with user input.

// Output:
// Enter Width of rectangle : 5
// Enter Length of rectangle : 5
//        *  *  *  *  *
//        *           *
//        *           *
//        *           *
//        *  *  *  *  *

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Width of rectangle : ");
        int width = input.nextInt();
        System.out.print("Enter Length of rectangle : ");
        int length = input.nextInt();

        for (int i=1; i<=width; i++){
            for(int j=1; j<=length; j++){
                if(i==1 || j==1 || i==width || j==length){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
