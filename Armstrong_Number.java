import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input a 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();

        int originalNumber = number;

        // Extract digits
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        // Calculate sum of cubes
        int sum = (digit1 * digit1 * digit1)
                + (digit2 * digit2 * digit2)
                + (digit3 * digit3 * digit3);

        // Check Armstrong number
        if (sum == originalNumber) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        //close scanner to prevent memory loss.
        sc.close();
    }
}