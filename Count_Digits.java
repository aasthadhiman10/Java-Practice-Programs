import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digits;

        if (number < 0) {
            number = -number;
        }

        if (number < 10) {
            digits = 1;
        } else if (number < 100) {
            digits = 2;
        } else if (number < 1000) {
            digits = 3;
        } else if (number < 10000) {
            digits = 4;
        } else if (number < 100000) {
            digits = 5;
        } else {
            digits = 6;
        }

        System.out.println("Number of digits: " + digits);

        //close scanner to prevent memory loss.
        sc.close();
    }
}