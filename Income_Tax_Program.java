import java.util.Scanner;

public class Income_Tax_Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();

        double tax;

        // Calculate tax based on income slabs
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = income * 0.05;
        } else if (income <= 1000000) {
            tax = income * 0.20;
        } else {
            tax = income * 0.30;
        }

        // Display tax
        System.out.println("Income: ₹" + income);
        System.out.println("Tax: ₹" + tax);

        sc.close();

        //close scanner to prevent memory loss.
    }
}