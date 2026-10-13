import java.util.Scanner;

public class Logical_Operations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        System.out.print("Enter logical operator (& or |): ");
        char operator = sc.next().charAt(0);

        boolean result;

        if (operator == '&') {
            result = (num1 != 0) && (num2 != 0);
            System.out.println("Result: " + result);

        } else if (operator == '|') {
            result = (num1 != 0) || (num2 != 0);
            System.out.println("Result: " + result);

        } else {
            System.out.println("Invalid logical operator.");
        }

        //close scanner to prevent memory loss.
        sc.close();
    }
}