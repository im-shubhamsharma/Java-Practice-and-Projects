import java.util.Scanner;

public class PrimeNumber {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check : ");
        int num = sc.nextInt();

        if (num==0 || num==1){
            System.out.println("Given number is not a prime number");
        }else{
            for (int i=2; i<num; i++){
                if(num%i == 0){
                    System.out.println("Given number is not a prime number");
                    break;
                }
                else{
                    System.out.println("Given number is a prime number");
                    break;
                }
            }

        }
    }
    
}
