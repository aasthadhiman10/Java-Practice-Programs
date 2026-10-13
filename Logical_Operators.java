import java.util.Scanner;
public class Logical_Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two boolean values
        System.out.print("Enter first boolean value (true/false): ");
        boolean a = sc.nextBoolean();

        System.out.print("Enter second boolean value (true/false): ");
        boolean b = sc.nextBoolean();

        // Logical operators
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
        System.out.println("!b: " + (!b));
        
        //close scanner to prevent memory loss.
        sc.close();
    }
}
