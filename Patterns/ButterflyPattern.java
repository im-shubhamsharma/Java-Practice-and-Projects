import java.util.*;

public class ButterflyPattern {
    public static void main(String args[]){
        int num = 4;

        //upper part
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int space = (num-i)*2;
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Part
        for(int i=1; i<=num; i++){
           for(int j=i; j<=num; j++){
               System.out.print("*");
           }
           for(int j=1; j<i;j++){
               System.out.print(" ");
           }
           for(int j=1; j<i;j++){
               System.out.print(" ");
           }
           for(int j=i; j<=num; j++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}