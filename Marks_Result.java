import java.util.Scanner;

public class Marks_Result {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks of Subject 1: ");
        int marks1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int marks2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int marks3 = sc.nextInt();

        // Calculate total and percentage
        int total = marks1 + marks2 + marks3;
        double percentage = (total / 300.0) * 100;

        // Display result
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        // Check pass or fail
        if (marks1 >= 40 && marks2 >= 40 && marks3 >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // Close Scanner to prevent memory loss.
        sc.close();
    }
}