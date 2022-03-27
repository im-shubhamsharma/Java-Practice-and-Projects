import java.util.Scanner;

public class InvertedHalfPyramid3{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter height of pyramid : ");
        int height = sc.nextInt();

        for (int i=1; i<=height; i++){
            for(int j=i; j>1; j--){
                System.out.print("\t");
            }
            for(int j=i; j<=height; j++){
                System.out.print("*\t");
            }
            System.out.println();

        }
    }

}