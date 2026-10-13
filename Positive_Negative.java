import java.util.Scanner;

public class Positive_Negative{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether a number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        //close scanner to prevent memory loss.
        sc.close();
    }
}