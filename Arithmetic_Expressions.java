import java.util.Scanner;

public class Arithmetic_Expressions{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        // Arithmetic operations
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        
        //Close Scanner to prevent Memory Loss.
        sc.close();
    }
}