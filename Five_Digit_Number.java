import java.util.Scanner;

public class Five_Digit_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = sc.nextInt();

        int firstDigit = number / 10000;
        int lastDigit = number % 10;

        if (firstDigit == lastDigit) {
            System.out.println("First and last digits are the same.");
        } else {
            System.out.println("First and last digits are not the same.");
        }

        //close scanner to prevent memory loss.
        sc.close();
    }
}