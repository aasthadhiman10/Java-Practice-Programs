import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        // Check whether the number is prime or not
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        //close scanner to prevent memory loss.
        sc.close();
    }
}