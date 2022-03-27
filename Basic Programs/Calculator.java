import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int num1 = scn.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = scn.nextInt();

        System.out.println(
                "************************\nEnter 1 for additon\nEnter 2 for subtraction\nEnter 3 for multiplication\nEnter 4 for division\nEnter 5 for Modulo/Remainder\n************************"); // Ignore
                                                                                                                                                                                                     // this

        System.out.print("Enter your option : ");
        int opt = scn.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Addition : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction : " + (num1 - num2));
                break;
            case 3:
                if (num1 == 0 || num2 == 0) {
                    System.out.println("Please enter valid input");
                } else {
                    System.out.println("Multiplication : " + (num1 * num2));
                }
                break;
            case 4:
                if (num1 == 0 || num2 == 0) {
                    System.out.println("Please enter valid input");
                } else {
                    System.out.println("Division : " + (num1 / num2));
                }
                break;
            case 5:
                if (num1 == 0 || num2 == 0) {
                    System.out.println("Please enter valid input");
                } else {
                    System.out.println("Modulo : " + (num1 % num2));
                }
                break;
            default:
                System.out.println("Please enter valid option");
        }

    }
}
