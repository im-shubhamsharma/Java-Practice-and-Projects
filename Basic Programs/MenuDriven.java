import java.util.Scanner;

public class MenuDriven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int opt;

        do{
            System.out.print("Enter your marks : ");
            int marks = sc.nextInt();
            
            if (marks>=90){
                System.out.println("This is Good");
            }
            else if(marks>=60 && marks<=89){
                System.out.println("This is Ohk");
            }
            else{
                System.out.println("This is average");
            }

            System.out.println("Do you want to continue : 1(yes)  / 0()no");
            opt = sc.nextInt();
        }while(opt == 1);
    }
}
