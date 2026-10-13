import java.util.Scanner;

public class Palindrome_Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int reverse = 0;

        // Reverse the number using arithmetic operations
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        // Type casting
        int result = (int) reverse;

        // Check palindrome
        if (originalNumber == result) {
            System.out.println(originalNumber + " is a Palindrome.");
        } else {
            System.out.println(originalNumber + " is not a Palindrome.");
        }

        //close scanner to prevent memory loss.
        sc.close();
    }
}