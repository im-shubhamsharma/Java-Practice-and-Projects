// Output:
// Enter height of triangle : 6
//        1
//        2  3
//        4  5  6
//        7  8  9  10
//        11  12  13  14  15
//        16  17  18  19  20  21

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height of triangle : ");
        int max = input.nextInt();
        int num = 1;

        for (int i=1; i<=max; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" "+num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
