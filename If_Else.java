import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Classify the character.
        if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Uppercase Letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Lowercase Letter.");
        } else {
            System.out.println(ch + " is a Special Character.");
        }

        //close scanner to prevent memory loss.
        sc.close();
    }
}