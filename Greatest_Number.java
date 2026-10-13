import java.util.Scanner;

public class Greatest_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Find the greatest number
        if (num1 > num2) {
            System.out.println(num1 + " is the greatest number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the greatest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        //close scanner to prevent memory loss.
        sc.close();
    }
}