import java.util.Scanner;

public class EvenNumber{
     public static void main(String args[]){
         Scanner scn = new Scanner(System.in);
         System.out.print("Enter you number : ");
         int num = scn.nextInt();

         for(int i=1; i<=num; i++){
             if(i%2==0){
                 System.out.print(i+" ");
             }
         }
     }

}