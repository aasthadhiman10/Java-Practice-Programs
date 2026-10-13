import java.util.Scanner;

public class Valid_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input three angles
        System.out.print("Enter first angle: ");
        int angle1 = sc.nextInt();

        System.out.print("Enter second angle: ");
        int angle2 = sc.nextInt();

        System.out.print("Enter third angle: ");
        int angle3 = sc.nextInt();

        // Check whether the angles form a valid triangle
        if (angle1 > 0 && angle2 > 0 && angle3 > 0
                && angle1 + angle2 + angle3 == 180) {
            System.out.println("The angles form a valid triangle.");
        } else {
            System.out.println("The angles do not form a valid triangle.");
        }

        //close scanner to prevent memory loss.
        sc.close();
    }
}