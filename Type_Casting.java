import java.util.Scanner;

public class Type_Casting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input a floating-point number
        System.out.print("Enter a floating-point number: ");
        double number = sc.nextDouble();

        // Explicit type casting from double to int
        int convertedNumber = (int) number;

        // Display values
        System.out.println("Original value: " + number);
        System.out.println("Converted integer value: " + convertedNumber);

        sc.close();
    }
}