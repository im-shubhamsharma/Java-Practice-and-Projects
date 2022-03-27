//Output:
//Enter size of rhombus : 5
//                    *  *  *  *  *
//                 *  *  *  *  *
//              *  *  *  *  *
//           *  *  *  *  *
//        *  *  *  *  *

import java.util.Scanner;

public class Rhombus {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of rhombus : ");
        int size = input.nextInt();


        for(int i=1; i<=size; i++){
            //loop for blank space
            for(int j=i; j<size; j++){
                System.out.print("   ");
            }
            //stars
            for(int j=1; j<=size; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
