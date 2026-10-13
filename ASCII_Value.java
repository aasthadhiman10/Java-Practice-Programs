import java.util.Scanner;

public class ASCII_Value {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Convert character to ASCII value
        int ascii = (int) ch;

        // Display the ASCII value
        System.out.println("ASCII value of " + ch + " is: " + ascii);
        
        //close scanner to prevent memory loss.
        sc.close();
    }
}