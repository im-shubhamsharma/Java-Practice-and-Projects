//output
//Enter height of pyramid : 5
//        1
//       212
//      32123
//     4321234
//    543212345

import java.util.Scanner;

public class PalindromicNumberPyramid {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height of pyramid : ");
        int height = input.nextInt();

        for (int i = 1; i <= height; i++) {
            //loop for blank space
            for (int j = i; j <= height; j++) {
                System.out.print(" ");
            }
            //loop for numbers first part
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            //loop for numbers second part
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
